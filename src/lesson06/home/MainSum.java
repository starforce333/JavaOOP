package lesson06.home;


public class MainSum {
    public static void main(String[] args) {

        ArraySum sum = new ArraySum();
        System.out.println(sum);
        sum.randomFill();
        System.out.println(sum);
        System.out.println("Simple");
        sum.simpleSum();

        for (int i = 0; i < 4; i++) {
            Thread thr = new Thread(sum);
            thr.start();
        }

    }
}
