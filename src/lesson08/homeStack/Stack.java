package lesson08.homeStack;


public class Stack {

    private BlackList black;
    private Object[] objectArray = new Object[10];
    private int position = 0;

    public Stack(Object[] object, int position) {
        this.objectArray = object;
        this.position = position;
    }

    public Stack() {
    }

    public Object[] getObject() {
        return objectArray;
    }

    public void setObject(Object[] object) {
        this.objectArray = object;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void setBlack(BlackList black) {
        this.black = black;
    }

    public void addObject(Object object) {
        if (black.check(object)) {
            System.out.println("Class " + object.getClass() + " in black list");
            return;
        }
        if (!black.check(object)) {
            try {
                if (object != null && !isFull()) {
                    objectArray[position] = object;
                    position++;
                    System.out.println("add " + object);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Stack is FULL!");
            }
        }
    }

    public void deleteObject() {
        try {
            objectArray[position - 1] = null;
            position--;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Stack is EMPTY!");
        }
    }

    public Object getElement() {
        return objectArray[position - 1];
    }

    public Object getElementDel() {
        Object temp = objectArray[position - 1];
        deleteObject();
        return temp;
    }

    private boolean isFull() {
        return (position > objectArray.length);
    }

    @Override
    public String toString() {
        int num = 0;
        String str = "";
        for (int i = 0; i < objectArray.length; i++) {
            if (objectArray[i] != null) {
                num++;
                str += num + ") " + objectArray[i] + System.lineSeparator();
            }
        }
        return str;
    }
}