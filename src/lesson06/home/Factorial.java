package lesson06.home;

import java.math.BigInteger;

public class Factorial implements Runnable {

    public Factorial() {
    }

    public BigInteger factorialCalc(long num) {
        BigInteger fact = new BigInteger("1");
        for (int i = 1; i <= num; i++) {
            fact = fact.multiply(new BigInteger("" + i));
        }
        return fact;
    }

    @Override
    public void run() {
        Thread thr = Thread.currentThread();
        long num = Integer.parseInt(thr.getName().substring(7));
        System.out.println(thr.getName() + " => " + num + " != " + factorialCalc(num));
    }
}