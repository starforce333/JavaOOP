package lesson02.home;

public class Round extends Point {
    private double a;
    private double r;

    public Round(double x, double y, double a, double r) {
        super(x, y);
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

}
