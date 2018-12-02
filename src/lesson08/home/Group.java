package lesson08.home;

import lesson08.home.exception.MaxGroupException;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Group implements Militarist, Serializable {

    private static final long serialVersionUID = 1L;
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

    public void studentAdd() {

        try {
            int numStudents = Integer.valueOf(JOptionPane.showInputDialog("How many students you want to add? NO more than " + (group.length - count)));

            if (numStudents > group.length - count) {
                throw new MaxGroupException();
            }

            if (numStudents <= 0) {
                JOptionPane.showMessageDialog(null, "Continue without adding students");
            }

            inputData(numStudents);

        } catch (MaxGroupException e) {
            JOptionPane.showMessageDialog(null, "Enter number less than " + (group.length - count));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error number format");
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Cancel");
        }
    }

    private void inputData(int a) {
        for (int i = 0; i < a; i++) {
            Student student = new Student();
            student.setSurname(String.valueOf(JOptionPane.showInputDialog("Enter student's " + (i + 1) + " surname")));
            student.setName(String.valueOf(JOptionPane.showInputDialog("Enter student's " + (i + 1) + " name")));
            student.setSex(String.valueOf(JOptionPane.showInputDialog("Enter student's " + (i + 1) + " sex (male or female)")));
            student.setUniversity(String.valueOf(JOptionPane.showInputDialog("Enter student's " + (i + 1) + " university")));
            student.setAge(Integer.valueOf(JOptionPane.showInputDialog("Enter student's " + (i + 1) + " age")));
            student.setId(Integer.valueOf(JOptionPane.showInputDialog("Enter student's " + (i + 1) + " ID")));
            studentAdd(student);
        }
    }

    public void studentAdd(Student student) {
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

    private void sortBySurname() {
        for (int i = 0; i < group.length - 1; i++) {
            for (int j = i + 1; j < group.length; j++) {
                if (compare(group[i], group[j]) > 0) {
                    Student temp = group[i];
                    group[i] = group[j];
                    group[j] = temp;
                }
            }
        }
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
        Arrays.sort(group, new StudentCompare(type));
    }

    public Student[] getRecruit() {
        int sCount = 0;
        for (int i = 0; i < group.length; i++) {
            if (group[i] != null && group[i].getSex().equals("male") && group[i].getAge() >= 18) {
                sCount++;
            }
        }
        Student[] recruits = new Student[sCount];
        int num = 0;
        for (int i = 0; i < group.length; i++) {
            if (group[i] != null && group[i].getSex().equals("male") && group[i].getAge() >= 18) {
                recruits[num] = group[i];
                num++;
            }
        }
        return recruits;
    }

    public List<Student> getRecruitUpd() {
        List<Student> recruits = new ArrayList<>();
        for (int i = 0; i < group.length; i++) {
            if (group[i] != null && group[i].getSex().equals("male") && group[i].getAge() >= 18) {
                recruits.add(group[i]);
            }
        }
        return recruits;
    }

    public void saveToFile() {
        File file = new File("myGroupUpd.csv");
        try (PrintWriter pw = new PrintWriter(file)) {
            String table = "";
            for (int i = 0; i < group.length; i++) {
                if (group[i] != null) {
                    table += group[i].getSurname() + ";" + group[i].getName() + ";" + group[i].getAge() + ";"
                            + group[i].getSex() + ";" + System.lineSeparator();
                }
            }
            pw.println(table);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
//        sortBySurname();
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