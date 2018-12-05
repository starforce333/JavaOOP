package lesson09.home.group;

import lesson09.home.group.exception.MaxGroupException;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Group implements Militarist, Serializable {

    private static final long serialVersionUID = 1L;
    private List<Student> group = new ArrayList<>();
    private int count;
    private int maxSize = 10;

    public Group(List<Student> group, int count) {
        this.group = group;
        this.count = count;
    }

    public Group() {
    }

    public List<Student> getGroup() {
        return group;
    }

    public void setGroup(List<Student> group) {
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
        if (group.size() >= maxSize) {
            throw new MaxGroupException();
        }
        group.add(student);
        count++;
    }

    public void studentDelete(String surname) {
        for (int i = 0; i < group.size(); i++) {
            if (group.get(i) == null) {
                continue;
            }
            if (group.get(i).getSurname().equals(surname)) {
                group.set(i, null);
                count--;
            }
        }
    }

    public String studentSearch(String surname) {
        for (int i = 0; i < group.size(); i++) {
            if (group.get(i) != null) {
                if (group.get(i).getSurname().equals(surname)) {
                    return "There is a student " + surname + " in this group.";
                }
            }
        }
        return "We don't have student " + surname + ". Ask another group.";
    }

    public int compare(Object a, Object b) {
        Student studOne = (Student) a;
        Student studTwo = (Student) b;

        if (a != null && b == null) {
            return 1;
        }
        if (a == null && b != null) {
            return -1;
        }
        if (a == null && b == null) {
            return 0;
        }
        return studOne.getSurname().compareTo(studTwo.getSurname());
    }

    public void sort(int type) {
        group.sort(new StudentCompare(type));
    }

    public Student[] getRecruit() {
        int sCount = 0;
        for (int i = 0; i < group.size(); i++) {
            if (group.get(i) != null && group.get(i).getSex().equals("male") && group.get(i).getAge() >= 18) {
                sCount++;
            }
        }
        Student[] recruits = new Student[sCount];
        int num = 0;
        for (int i = 0; i < group.size(); i++) {
            if (group.get(i) != null && group.get(i).getSex().equals("male") && group.get(i).getAge() >= 18) {
                recruits[num] = group.get(i);
                num++;
            }
        }
        return recruits;
    }

    public List<Student> getRecruitUpd() {
        List<Student> recruits = new ArrayList<>();
        for (int i = 0; i < group.size(); i++) {
            if (group.get(i) != null && group.get(i).getSex().equals("male") && group.get(i).getAge() >= 18) {
                recruits.add(group.get(i));
            }
        }
        return recruits;
    }

    public void saveToFile() {
        File file = new File("myGroupUpd.csv");
        try (PrintWriter pw = new PrintWriter(file)) {
            String table = "";
            for (Student student : group) {
                if (student != null) {
                    table += student.getSurname() + ";" + student.getName() + ";" + student.getAge() + ";"
                            + student.getSex() + ";" + System.lineSeparator();
                }
            }
            pw.println(table);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        int num = 0;
        String str = "Group has " + count + " students:" + System.lineSeparator();
        for (Student student : group) {
            if (student != null) {
                num++;
                str += num + ") " + student + System.lineSeparator();
            }
        }
        return str;
    }
}