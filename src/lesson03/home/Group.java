package lesson03.home;

import lesson03.home.exception.MaxGroupException;

import java.util.Arrays;

public class Group {
    private Student[] group = new Student[10];

    public Group(Student[] group) {
        this.group = group;
    }

    public Group() {
    }

    public Student[] getGroup() {
        return group;
    }

    public void setGroup(Student[] group) {
        this.group = group;
    }

    public Student[] studentAdd(Student student) throws MaxGroupException {
        for (int i = 0; i < group.length; i++) {
            if (group[i] == null) {
                group[i] = student;
                return group;
            }
        }
        throw new MaxGroupException();
    }

    public void studentDelete(String surname) {
        for (int i = 0; i < group.length; i++) {
            if (group[i] != null) {
                if (group[i].getSurname() == surname) {
                    group[i] = null;
                }
            }
        }
    }

    public String studentSearch(String surname) {
        for (int i = 0; i < group.length; i++) {
            if (group[i] != null) {
                if (group[i].getSurname() == surname) {
                    return "There is a student " + surname + " in this group.";
                }
            }
        }
        return "We don't have student " + surname + ". Ask another group.";
    }

    @Override
    public String toString() {

        return "Group{" +
                "group=" + Arrays.toString(group) +
                '}';
    }
}