package lesson01.vector;

public class Main {
    public static void main(String[] args) {

        Vector3d vectorA = new Vector3d(3, 4, 5);
        Vector3d vectorB = new Vector3d(4, 5, 6);


        Vector3d result = new Vector3d();

        System.out.println("Addition:" + System.lineSeparator() + result.addition(vectorA, vectorB));
        System.out.println();

        System.out.println("Scalar:" + System.lineSeparator() + result.scalar(vectorA, vectorB));
        System.out.println();

        System.out.println("Vector:" + System.lineSeparator() + result.vector(vectorA, vectorB));
    }
}