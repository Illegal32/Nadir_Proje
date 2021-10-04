package application.map;

import java.util.Objects;

public class Person {

    private String username;

    private String fin;

    private String password;

    private Double bonus;

    public Person() {
    }

    public Person(String fin) {
        this.fin = fin;
    }

    public Person(String username, String fin, String password) {
        this.username = username;
        this.fin = fin;
        this.password = password;
    }

    public Person(String username, String password, String fin, Double bonus) {
        this.username = username;
        this.password = password;
        this.fin = fin;
        this.bonus = bonus;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return username.equals(person.username) && fin.equals(person.fin) && password.equals(person.password) && bonus.equals(person.bonus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, fin, password, bonus);
    }

    @Override
    public String toString() {
        return "Person{" +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", fin='" + fin + '\'' +
                ", bonus=" + bonus +
                '}';
    }
}