package lesson02.home;

public class Square extends Shape {
    private Point a;
    private Point b;
    private Point c;
    private Point d;


    public Square(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    public Square() {
    }

    public Point getA() {
        return a;
    }
    public void setA(Point a) {
        this.a = a;
    }
    public Point getB() {
        return b;
    }
    public void setB(Point b) {
        this.b = b;
    }
    public Point getC() {
        return c;
    }
    public void setC(Point c) {
        this.c = c;
    }
    public Point getD() {
        return d;
    }
    public void setD(Point d) {
        this.d = d;
    }


    @Override
    public double getArea() {
        double area = a.getDistance(a, b) * b.getDistance(b, c);
        return area;
    }
    @Override
    public double getPerimetr() {
        double per = 2 * a.getDistance(a, b) * b.getDistance(b, c);
        return per;
    }

    @Override
    public String toString() {
        return "Square ";
    }
}
