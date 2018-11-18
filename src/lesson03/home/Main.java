package lesson03.home;

import lesson03.home.exception.MaxGroupException;

public class Main {
    public static void main(String[] args) {

        Student one = new Student("Jones", "Alex", "male", 25, "Academy", 242);
        Student two = new Student("Bucket", "Max", "male", 26, "Academy", 242);
        Student three = new Student("Skywalker", "Anakin", "male", 32, "Academy", 242);
        Student four = new Student("Darth", "Vader", "male", 33, "Academy", 242);
        Student five = new Student("Solo", "Han", "male", 31, "Academy", 242);
        Student six = new Student("Master", "Yoda", "male", 700, "Academy", 242);
        Student seven = new Student("Kenobi", "Obi-Wan", "male", 35, "Academy", 242);
        Student eight = new Student("Solo", "Lea", "female", 29, "Academy", 242);
        Student nine = new Student("Skywalker", "Luke", "male", 29, "Academy", 242);
        Student ten = new Student("C3PO", "Droid", "male", 20, "Academy", 242);
        Student eleven = new Student("R2D2", "Astrodroid", "male", 21, "Academy", 242);

        Group group242 = new Group();

        try {
            group242.studentAdd(one);
            group242.studentAdd(two);
            group242.studentAdd(three);
            group242.studentAdd(four);
            group242.studentAdd(five);
            group242.studentAdd(six);
            group242.studentAdd(seven);
            group242.studentAdd(eight);
            group242.studentAdd(nine);
            group242.studentAdd(ten);
            group242.studentAdd(eleven);
        } catch (MaxGroupException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(group242);
        System.out.println();
        group242.studentDelete(two.getSurname());
        group242.studentDelete(seven.getSurname());
        group242.studentDelete(one.getSurname());
        System.out.println();
        System.out.println(group242);
        System.out.println();
        System.out.println(group242.studentSearch(eleven.getSurname()));
        System.out.println(group242.studentSearch(five.getSurname()));
    }
}