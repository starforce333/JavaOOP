package lesson01.vector;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Vector3d vectorA = new Vector3d(3, 4, 5);
        Vector3d vectorB = new Vector3d(4, 5, 6);

        System.out.println(vectorA + " " + vectorB);

        Vector3d result = new Vector3d();
        result.addition(vectorA.getX(), vectorB.getX(), vectorA.getY(), vectorB.getY(), vectorA.getZ(), vectorB.getZ());
        System.out.println(Arrays.toString(result.getAddition()));

        result.scalar(vectorA.getX(), vectorB.getX(), vectorA.getY(), vectorB.getY(), vectorA.getZ(), vectorB.getZ());
        System.out.println(Arrays.toString(result.getScalar()));

        result.vector(vectorA.getX(), vectorB.getX(), vectorA.getY(), vectorB.getY(), vectorA.getZ(), vectorB.getZ());
        System.out.println(Arrays.toString(result.getVector()));
    }
}
