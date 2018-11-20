package lesson04.home;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Student one = new Student("Jones", "Alex", "male", 18, "Academy", 242);
        Student two = new Student("Bucket", "Max", "male", 26, "Academy", 242);
        Student three = new Student("Skywalker", "Anakin", "male", 15, "Academy", 242);
        Student four = new Student("Darth", "Vader", "male", 33, "Academy", 242);
        Student five = new Student("Solo", "Han", "male", 31, "Academy", 242);
        Student six = new Student("Master", "Yoda", "male", 700, "Academy", 242);
        Student seven = new Student("Kenobi", "Obi-Wan", "male", 35, "Academy", 242);
        Student eight = new Student("Solo", "Lea", "female", 29, "Academy", 242);

        Group group242 = new Group();
        group242.studentAdd(one);
        group242.studentAdd(two);
        group242.studentAdd(three);
        group242.studentAdd(four);
        group242.studentAdd(five);
        group242.studentAdd(six);
        group242.studentAdd(seven);
        group242.studentAdd(eight);

        group242.studentAdd();
        System.out.println("Full group: ");
        System.out.println(group242);
        System.out.println();

        group242.sort(0);
        System.out.println("Group sorted by type");
        System.out.println(group242);

        group242.studentDelete(two.getSurname());
        group242.studentDelete(six.getSurname());
        System.out.println("Check delete method");
        System.out.println(group242);
        System.out.println(group242.studentSearch(five.getSurname()));
        System.out.println();
        System.out.println("Ready to army " + group242.getRecruit().length + " students:");
        System.out.println(Arrays.toString(group242.getRecruit()));
//        System.out.println();
//        System.out.println("Ready to army " + group242.getRecruitUpd().size() + " students:");
//        System.out.println(group242.getRecruitUpd());
    }
}