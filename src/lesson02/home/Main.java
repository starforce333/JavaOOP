package lesson02.home;

public class Main {

    public static void main(String[] args) {

        Square sqr = new Square(1, 5, 3, 4, 3, 4);

        Triangle tri = new Triangle(1, 5, 3, 4, 5);

        Round round = new Round(1, 5, 3, 8);
        Shape spSqr = sqr;

        System.out.println(spSqr.getArea());
        System.out.println();
        Shape spTri = tri;
        System.out.println(spTri.getPerimetr());
        System.out.println();
        Shape spRou = round;
        System.out.println(spRou.getArea());


    }
}