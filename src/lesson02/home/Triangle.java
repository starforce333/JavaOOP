package lesson02.home;

public class Triangle extends Shape {

    private double a;
    private double b;
    private double c;
    private Point forTri = new Point();

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() {
    }

    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }
    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }
    public double getC() {
        return c;
    }
    public void setC(double c) {
        this.c = c;
    }
    @Override
    public double getArea() {
        double per = (a + b + c) / 2;
        double area = Math.sqrt(per * (per - a) * (per - b) * (per - c));
        return area;
    }
    @Override
    public double getPerimetr() {
        double per = a + b + c;
        return per;
    }

    @Override
    public String toString() {
        return "Triangle ";
    }
}
