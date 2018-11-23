package lesson06.home;

import java.math.BigInteger;

public class Factorial implements Runnable {
    private int number;
    private Thread [] threads;

    public Factorial(int number) {
        this.number = number;
    }

    public Factorial() {
    }

    public BigInteger factorialCalc(int num) {
        BigInteger fact = new BigInteger("1");
        for (int i = 1; i <= num; i++) {
            fact = fact.multiply(new BigInteger("" + i));
        }
        return fact;
    }

    public void countThread (int value) {
        Thread [] array = new Thread[value];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Thread(new Factorial(i));
            array[i].start();
        }

    }

    @Override
    public void run() {
        Thread thr = Thread.currentThread();
        for (int i = 1; i < this.number; i++) {
            System.out.println(thr.getName() + " => " + i + " != " + factorialCalc(i));
        }
    }
}


//        Создайте сто потоков, которые будут вычислять факториал
//        числа, равного номеру этого потока, и выводить результат на
//        экран.
//        2) Написать код для многопоточного подсчета суммы элементов
//        массива целых чисел. Сравнить скорость подсчета с простым
//        алгоритмом.
//        3) Напишите многопоточный вариант сортировки массива
//        методом Шелла.
//        4) Реализуйте многопоточное копирование каталога,
//        содержащего несколько файлов.
//        5) Реализуйте программу, которая с периодичностью 1 сек,
//        будет проверять состояние заданного каталога. Если в этом
//        каталоге появится новый файл или исчезнет существующий,
//        то выведется сообщение об этом событии. Программа
//        должна  работать в параллельном потоке выполнения.
