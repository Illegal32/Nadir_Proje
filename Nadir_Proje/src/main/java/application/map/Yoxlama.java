package application.map;

public class Yoxlama extends Thread {
    private double sum;
    private final int id;

    Yoxlama(int id, String name) {
        super(name);
        this.id = id;
    }

    public double getSum() {
        return sum;
    }

    public void run() {
        sum = 0.0;
        for (int i = 0; i < 100_000_000; i++)
            sum += 5 * i + Math.pow(id, 4);
    }

    public static long getTime() {
        return System.currentTimeMillis();
    }

    public static void main(String[] args) {
        int coreCount = Runtime.getRuntime().availableProcessors();
        System.out.println("Core count = " + coreCount);
        double sum1 = 0.0;

        // Sequential run
        long before = getTime();
        for (int i = 0; i < coreCount; i++)
            for (int j = 0; j < 100_000_000; j++)
                sum1 += 5 * j + Math.pow(i + 1, 4);
        long after = getTime();
        long time1 = after - before;

        // Parallel run
        Yoxlama[] t = new Yoxlama[coreCount];
        before = getTime();
        for (int i = 1; i <= coreCount; i++) {
            t[i - 1] = new Yoxlama(i, "Thread #" + i);
            t[i - 1].start();
        }

        try {
            for (int i = 0; i < coreCount; i++)
                t[i].join();
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }

        long sum2 = 0;
        for (int i = 0; i < coreCount; i++)
            sum2 += t[i].getSum();
        after = getTime();
        long time2 = after - before;

        // Compare results
        System.out.println("Time 1 (in ms): " + time1);
        System.out.println("Time 2 (in ms): " + time2);
        System.out.println("Difference (times): " + (time1 * 1.0 / time2));
    }
}