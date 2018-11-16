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
            if (group[i].getSurname() == surname) {
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

//    private void sort() {
//        for (int i = 0; i < group.length; i++) {
//            if (group[i] !=null && )
//            //bubbles
//        }
//    }

//    private int compare(Student a, Student b) {
//        if (a != null && b == null) {
//            return 1;
//        }
//        if (a == null && b != null) {
//            return -1;
//        }
//        if (a == null && b == null) {
//            return 0;
//        } return "Error"
//    }


    @Override
    public String toString() {
        group = moveNull();
        return "Group has " + count + " students:" + System.lineSeparator() + Arrays.toString(group);
    }
}