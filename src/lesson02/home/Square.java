package lesson02.home;

public class Square extends Shape {
    private double a;
    private double b;
    private double c;
    private double d;
    private Point forSqr = new Point();

    public Square(double a, double b, double c, double d) {

        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public Square() {
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
    public double getD() {
        return d;
    }
    public void setD(double d) {
        this.d = d;
    }

    public Point getForSqr() {
        return forSqr;
    }

    @Override
    public double getArea() {
        double area = a * b;
        return area;
    }
    @Override
    public double getPerimetr() {
        double per = a + b + c + d;
        return per;
    }

    @Override
    public String toString() {
        return "Square ";
    }
}
