//package application.map;
//
//import java.util.List;
//import java.util.Scanner;
//
//public class Main {
//
//    private static final Scanner sc = new Scanner(System.in);
//
//    public static void main(String[] args) {
//
//        PersonDetailLoader.load();
//        List<Person> people = PersonDetailLoader.people;
//
//        System.out.print("Enter id : ");
//
//        int id = sc.nextInt();
//
//        for (Person person : people)
//            if (person.getId() == id)
//                System.out.println(person);
//
//        // map way
//        PersonDetailLoaderMap.load();
//
//        Person person = PersonDetailLoaderMap.map.get(id);
//        System.out.println(person);
//
//    }
//}
