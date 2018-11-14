package lesson02.home;

public class Triangle extends Shape {

    private Point a;
    private Point b;
    private Point c;


    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public Triangle() {
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


    @Override
    public double getArea() {
        double per = (a.getDistance(a, b) + b.getDistance(b, c) + c.getDistance(c, a)) / 2;
        double area = Math.sqrt(per * (per - a.getDistance(a, b)) * (per - b.getDistance(b, c)) * (per - c.getDistance(c, a)));
        return area;
    }
    @Override
    public double getPerimetr() {
        double per = (a.getDistance(a, b) + b.getDistance(b, c) + c.getDistance(c, a));
        return per;
    }

    @Override
    public String toString() {
        return "Triangle ";
    }
}
