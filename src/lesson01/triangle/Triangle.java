package lesson01.triangle;

public class Triangle {
    private double a;
    private double b;
    private double c;
    private double square;

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
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }
    public double sqr() {
        double per = (a + b + c) / 2;
        square = Math.sqrt(per * (per - a) * (per - b) * (per - c));
        return square;
    }
    @Override
    public String toString() {
        return "Triangle{" +
                "square=" + square +
                '}';
    }
}