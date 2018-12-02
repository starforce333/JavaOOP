package lesson08.homeStack;

import java.util.Arrays;

public class BlackList {
    Class[] blArray = new Class[10];
    private int position = 0;

    public BlackList(Class[] blArray) {
        this.blArray = blArray;
    }

    public BlackList() {
    }

    public Class[] getBlArray() {
        return blArray;
    }

    public void setBlArray(Class[] blArray) {
        this.blArray = blArray;
    }

    public void addClass(Class myClass) {
        blArray[position] = myClass;
        position++;
    }


    public boolean check(Object object) {
        for (int i = 0; i < position; i++) {
            if (blArray[i] == null) {
                continue;
            }
            if (blArray[i].equals(object.getClass())) {
                return true;
            }
        }
        return false;
    }

    public void deleteObject(Class myClass) {
        if (myClass != null) {
            for (int i = 0; i < position; i++) {
                if (blArray[i].equals(myClass)) {
                    blArray[i] = null;
                }
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BlackList blackList = (BlackList) o;
        return Arrays.equals(blArray, blackList.blArray);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(blArray);
    }

    @Override
    public String toString() {
        int num = 0;
        String str = "Class BlackList:" + System.lineSeparator();
        for (int i = 0; i < blArray.length; i++) {
            if (blArray[i] != null) {
                num++;
                str += num + ") " + blArray[i] + System.lineSeparator();
            }
        }
        return str;
    }
}
