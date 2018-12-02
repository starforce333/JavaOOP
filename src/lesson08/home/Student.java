package lesson08.home;

import java.io.Serializable;

public class Student extends Human implements Serializable {

    private String university;
    private int id;

    public Student(String surname, String name, String sex, int age, String university, int id) {
        super(surname, name, sex, age);
        this.university = university;
        this.id = id;
    }

    public Student() {
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "student " + getSurname() + " " + getName();
    }
}