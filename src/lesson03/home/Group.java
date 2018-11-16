package lesson03.home;

import lesson03.home.exception.MaxGroupException;

import java.util.Arrays;

public class Group {
    private Student[] group = new Student[10];
    private int count;


    public Group(Student[] group, int count) {
        this.group = group;
        this.count = count;
    }

    public Group() {
    }

    public Student[] getGroup() {
        return group;
    }

    public void setGroup(Student[] group) {
        this.group = group;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void studentAdd(Student student) throws MaxGroupException {
        if (student == null) {
            throw new IllegalArgumentException("Null student");
        }
        for (int i = 0; i < group.length; i++) {
            if (group[i] == null) {
                group[i] = student;
                count++;
                return;
            }
        }
        throw new MaxGroupException();
    }

    public void studentDelete(String surname) {
        for (int i = 0; i < group.length; i++) {
            if (group[i] == null) {
                continue;
            }
            if (group[i].getSurname().equals(surname)) {
                group[i] = null;
                count--;
            }
        }
    }

    public String studentSearch(String surname) {
        for (int i = 0; i < group.length; i++) {
            if (group[i] != null) {
                if (group[i].getSurname().equals(surname)) {
                    return "There is a student " + surname + " in this group.";
                }
            }
        }
        return "We don't have student " + surname + ". Ask another group.";
    }

    private void sort(Student[] group) {
        for (int i = 0; i < group.length; i++) {
            for (int j = 0; j < group.length - 1; j++) {
                try {
                    if (group[j].getSurname().compareTo(group[j + 1].getSurname()) > 0) {
                        Student temp = group[j];
                        group[j] = group[j + 1];
                        group[j + 1] = temp;
                    }
                } catch (NullPointerException e) {

                }
            }
        }
    }

    @Override
    public String toString() {
//        group = moveNull();
        sort(group);
        int num = 0;
        String str = "Group has " + count + " students:" + System.lineSeparator();
        for (int i = 0; i < group.length; i++) {
            if (group[i] != null) {
                num++;
                str += num + ") " + group[i] + System.lineSeparator();
            }
        }
        return str;
    }
}