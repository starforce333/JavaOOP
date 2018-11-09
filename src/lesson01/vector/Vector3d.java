package lesson01.vector;

public class Vector3d {
    private double x;
    private double y;
    private double z;


    public Vector3d(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Vector3d() {
    }

    public Vector3d addition(Vector3d a, Vector3d b) {
        Vector3d res = new Vector3d();
        res.setX(a.getX() + b.getX());
        res.setY(a.getY() + b.getY());
        res.setZ(a.getZ() + b.getZ());
        return res;
    }

    public double scalar(Vector3d a, Vector3d b) {
        double res = a.getX() * b.getX() + a.getY() * b.getY() + a.getZ() * b.getZ();
        return res;
    }

    public Vector3d vector(Vector3d a, Vector3d b) {
        Vector3d res = new Vector3d();
        res.setX(a.getY() * b.getZ() - a.getZ() * b.getY());
        res.setY(a.getZ() * b.getX() - a.getX() * b.getZ());
        res.setZ(a.getX() * b.getY() - a.getY() * b.getX());
        return res;
    }

    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
    public double getZ() {
        return z;
    }
    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Vector3d{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}