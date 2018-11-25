package lesson06.home;

public class MainFact {
    public static void main(String[] args) {

        for (int i = 1; i < 100; i++) {
            Factorial fact = new Factorial();
            Thread task = new Thread(fact);
            task.start();
        }
    }
}
