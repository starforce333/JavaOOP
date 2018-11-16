package lesson04.home;

import lesson04.home.exception.MaxGroupException;

public class Group implements Comparable{
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

    }


    @Override
    public int compareTo(Object o) {
        Student other = (Student) o;

        if (this.getAge > other.getAge()) {
            return 1;
        }
        if (this.getId() < other.getAge()) {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
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