package lesson02.home;

public class Round extends Shape {
    private double a;
    private double r;
    private Point forRou = new Point();

    public Round(double a, double r) {
        this.a = a;
        this.r = r;
    }

    public Round() {
    }
    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }
    public double getR() {
        return r;
    }
    public void setR(double r) {
        this.r = r;
    }
    @Override
    public double getArea() {
        double area = 2 * Math.PI * r * r;
        return area;

    }
    @Override
    public double getPerimetr() {
        double per = 2 * Math.PI * r;
        return per;
    }

    @Override
    public String toString() {
        return "Round ";
    }
}
