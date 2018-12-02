package lesson07.school;

public class Main {
    public static void main(String[] args) {

        Action action = new Action();
        Pull pull = new Pull(action);
        Push push = new Push(action);
        Thread threadOne = new Thread(pull);
        Thread threadTwo = new Thread(push);
        threadOne.start();
        threadTwo.start();

    }
}
