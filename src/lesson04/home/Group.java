package lesson04.home;

import lesson04.home.exception.MaxGroupException;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Group implements Militarist {
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
            int a = Integer.valueOf(JOptionPane.showInputDialog("How many students you want to add? NO more than " + (group.length - count)));
            if (a > group.length - count) {
                throw new MaxGroupException();
            }
            if (a < 0) {
                throw new NullPointerException();
            }
            if (a == 0) {
                JOptionPane.showMessageDialog(null, "Continue without adding students");
            }
            for (int i = 0; i < a; i++) {
                Student student = new Student();
                student.setSurname(String.valueOf(JOptionPane.showInputDialog("Enter student's " + (i + 1) + " surname")));
                student.setName(String.valueOf(JOptionPane.showInputDialog("Enter student's " + (i + 1) + " name")));
                student.setSex(String.valueOf(JOptionPane.showInputDialog("Enter student's " + (i + 1) + " sex (male or female)")));
                student.setUniversity(String.valueOf(JOptionPane.showInputDialog("Enter student's " + (i + 1) + " university")));
                student.setAge(Integer.valueOf(JOptionPane.showInputDialog("Enter student's " + (i + 1) + " age")));
                student.setId(Integer.valueOf(JOptionPane.showInputDialog("Enter student's " + (i + 1) + " ID")));
                for (int j = 0; j < group.length; j++) {
                    if (group[j] == null) {
                        group[j] = student;
                        count++;
                        break;
                    }
                }
            }
        } catch (MaxGroupException e) {
            JOptionPane.showMessageDialog(null, "Enter number less than " + (group.length - count));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error number format");
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Cancel");
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

    @Override
    public ArrayList getRecruit() {
        ArrayList recruits = new ArrayList();
        for (int i = 0; i < group.length; i++) {
            if (group[i] != null && group[i].getSex().equals("male") && group[i].getAge() > 18) {
                recruits.add(group[i]);
            }
        }
        return recruits;
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