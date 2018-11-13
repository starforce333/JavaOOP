package lesson02.home;

public class Main {

    public static void main(String[] args) {

        Square sqr = new Square(3, 4, 3, 4);

        Triangle tri = new Triangle(5, 6, 7);

        Round round = new Round(3, 8);

        System.out.println("Square");
        System.out.print("Area of sqr: ");
        System.out.println(sqr.getArea());
        System.out.print("Perimeter of sqr: ");
        System.out.println(sqr.getPerimetr());
        System.out.println();
        System.out.println("Triangle");
        System.out.print("Perimeter of tri: ");
        System.out.println(tri.getPerimetr());
        System.out.print("Area of tri: ");
        System.out.println(tri.getArea());
        System.out.println();
        System.out.println("Round");
        System.out.print("Area of round: ");
        System.out.println(round.getArea());
        System.out.print("Perimeter of round: ");
        System.out.println(round.getPerimetr());
        System.out.println();

        Board blackboard = new Board();
        blackboard.putFigure(round);
        blackboard.putFigure(tri);
        blackboard.putFigure(sqr);
        blackboard.putFigure(sqr);

        blackboard.removeFigure(sqr);
        blackboard.removeFigure(tri);

        blackboard.putFigure(round);
        blackboard.putFigure(tri);

        blackboard.showFigures();
        blackboard.areaBoard();

    }
}