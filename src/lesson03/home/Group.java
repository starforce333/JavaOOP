package lesson03.home;

import lesson03.home.exception.MaxGroupException;

import java.util.Arrays;
import java.util.Comparator;


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

    public void studentDelete(Student student) {
        for (int i = 0; i < group.length; i++) {
            if (group[i] == student) {
                group[i] = null;
                count--;
            }
        }
    }

    public String studentSearch(Student surname) {
        for (int i = 0; i < group.length; i++) {
            if (group[i] != null) {
                if (group[i].equals(surname)) {
                    return "There is a student " + surname.getSurname() + " in this group.";
                }
            }
        }
        return "We don't have student " + surname.getSurname() + ". Ask another group.";
    }

    public Student[] moveNull() {
        int a = 0;
        Student[] tempGroup = new Student[group.length];
        for (int i = 0; i < group.length; i++) {
            if (group[i] != null) {
                tempGroup[a] = group[i];
                a++;
            }
        }
        return tempGroup;
    }

    @Override
    public String toString() {
        group = moveNull();
        return "Group has " + count + " students:" + System.lineSeparator() + Arrays.toString(group);
    }
}