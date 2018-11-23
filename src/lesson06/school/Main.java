package lesson06.school;

public class Main {
    public static void main(String[] args) {

        FactorialTask one = new FactorialTask(10);
        FactorialTask two = new FactorialTask(10);
        FactorialTask three = new FactorialTask(10);

        Thread threadOne = new Thread(one);
        Thread threadTwo = new Thread(two);
        Thread threadThree = new Thread(three);

        threadOne.start();
        threadTwo.start();
        threadThree.start();

//        try {
//            threadOne.join();
//            threadTwo.join();
//            threadThree.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }


        threadOne.interrupt();
        threadTwo.interrupt();
        threadThree.interrupt();


        Thread mainThread = Thread.currentThread();
        System.out.println(mainThread.getName() + " STOP!");
    }
}
