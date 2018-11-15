package lesson03.home;

public class Student extends Human {

    private String university;
    private int group;

    public Student(String surname, String name, String sex, int age, String university, int group) {
        super(surname, name, sex, age);
        this.university = university;
        this.group = group;
    }

    public Student() {
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }


    @Override
    public String toString() {
        return "student " + getSurname() + " " + getName();
    }
}