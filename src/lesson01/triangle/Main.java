package lesson01.triangle;

public class Main {
    public static void main(String[] args) {

        Triangle triOne = new Triangle(3, 4, 5);
        Triangle triTwo = new Triangle(triOne.getA() + 1, triOne.getB() + 2, triOne.getC() + 3);


        System.out.println(triOne.sqr());
        System.out.println(triTwo.sqr());


    }
}
