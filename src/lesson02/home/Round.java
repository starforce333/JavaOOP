package lesson02.home;

public class Round extends Shape {
    private Point a;
    private Point r;


    public Round(Point a, Point r) {
        this.a = a;
        this.r = r;
    }
    public Round() {
    }

    public Point getA() {
        return a;
    }
    public void setA(Point a) {
        this.a = a;
    }
    public Point getR() {
        return r;
    }
    public void setR(Point r) {
        this.r = r;
    }
    @Override
    public double getArea() {
        double area = 2 * Math.PI * r.getDistance(a,r) * r.getDistance(a,r);
        return area;

    }
    @Override
    public double getPerimetr() {
        double per = 2 * Math.PI * r.getDistance(a,r);
        return per;
    }

    @Override
    public String toString() {
        return "Round ";
    }
}
