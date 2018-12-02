package lesson08.home;

import java.io.Serializable;

public class Human implements Serializable {

    private String surname;
    private String name;
    private String sex;
    private int age;


    public Human(String surname, String name, String sex, int age) {
        this.surname = surname;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public Human() {
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}