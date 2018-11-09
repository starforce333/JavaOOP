package lesson02.home;

public class Square extends Point {
    private double a;
    private double b;
    private double c;
    private double d;

    public Square(double x, double y, double a, double b, double c, double d) {
        super(x, y);
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

}
