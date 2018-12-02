package lesson08.home;

import java.util.Comparator;

public class StudentCompare implements Comparator {

    private int type;

    public StudentCompare(int type) {
        this.type = type;
    }

    public StudentCompare() {
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
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
        switch (type) {
            case 0:
                return studOne.getSurname().compareTo(studTwo.getSurname());
            case 1: {
                if (studOne.getAge() > studTwo.getAge()) {
                    return 1;
                }
                if (studOne.getAge() < studTwo.getAge()) {
                    return -1;
                }
                return 0;
            }
            case 2:
                return studOne.getUniversity().compareTo(studTwo.getUniversity());
            case 3:
                return studOne.getName().compareTo(studTwo.getName());
            case 4:
                return studOne.getSex().compareTo(studTwo.getSex());
        }
        return 0;
    }

    @Override
    public String toString() {
        return "StudentCompare{" +
                "type=" + type +
                '}';
    }
}