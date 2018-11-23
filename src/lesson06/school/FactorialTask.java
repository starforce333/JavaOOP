package lesson06.school;

import java.math.BigInteger;

public class FactorialTask implements Runnable {
    private int number;

    public FactorialTask(int number) {
        this.number = number;
    }

    public BigInteger factorialCalc(int num) {
        BigInteger fact = new BigInteger("1");
        for (int i = 1; i <= num; i++) {
            fact = fact.multiply(new BigInteger("" + i));
        }
        return fact;
    }


    @Override
    public void run() {
        Thread thr = Thread.currentThread();
        for (int i = 1; i < this.number; i++) {
            System.out.println(thr.getName()+ " => " + i + " != " + factorialCalc(i));

            if (thr.isInterrupted()) {
                System.out.println(thr.getName() + " Interrupted");
                return;
            }
        }
    }


}
