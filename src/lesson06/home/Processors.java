package lesson06.home;

public class Processors {
    public static void main(String[] args) {
        int pro = Runtime.getRuntime().availableProcessors();
        System.out.println(pro);
    }
}
