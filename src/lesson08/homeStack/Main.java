package lesson08.homeStack;

public class Main {
    public static void main(String[] args) {

        Stack stack = new Stack();
        BlackList bl = new BlackList();
        stack.setBlack(bl);
        bl.addClass(Bird.class);
        bl.addClass(Snake.class);
        System.out.println();

        Cat catOne = new Cat("Vaska", "black", 3);
        Cat catTwo = new Cat("Murka", "white", 1);
        Cat catThree = new Cat("Happy", "red", 2);

        Dog dogOne = new Dog("Bim", "white", 2);
        Dog dogTwo = new Dog("Chappy", "red", 5);
        Dog dogThree = new Dog("Cap", "black", 3);

        Snake snakeOne = new Snake("Snake", "black", 3);
        bl.deleteObject(Bird.class);
        Bird birdTwo = new Bird("Kesha", "white", 1);
        stack.addObject(snakeOne);
        stack.addObject(birdTwo);

        System.out.println();
        System.out.println(bl);
        stack.addObject(catOne);
        stack.addObject(catTwo);
        stack.addObject(catThree);

        System.out.println();
        System.out.println(stack.getElement());
        stack.deleteObject();
        System.out.println();
        System.out.println(stack);

        stack.addObject(dogOne);
        stack.addObject(dogTwo);
        stack.addObject(dogThree);
        System.out.println();
        System.out.println(stack.getElementDel());
        System.out.println(stack);
    }
}
