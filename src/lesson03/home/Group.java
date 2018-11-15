package lesson03.home;

import lesson03.home.exception.MaxGroupException;

import java.util.Arrays;

public class Group {
    private Student[] group = new Student[10];
    private int count;

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
                count++;
                return group;
            }
        }
        throw new MaxGroupException();
    }

    public void studentDelete(Student surname) {
        for (int i = 0; i < group.length; i++) {
            if (group[i] != null) {
                if (group[i].equals(surname)) {
                    group[i] = null;
                    count--;
                }
            }
        }
    }

    public String studentSearch(Student surname) {
        for (int i = 0; i < group.length; i++) {
            if (group[i] != null) {
                if (group[i].equals(surname)) {
                    return "There is a student " + surname.getSurname() + " " + surname.getName() + " in this group.";
                }
            }
        }
        return "We don't have student " + surname.getSurname() + " " + surname.getName() + ". Ask another group.";
    }


    @Override
    public String toString() {

        return "Group: " + System.lineSeparator() +
                Arrays.toString(group);
    }
}