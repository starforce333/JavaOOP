package lesson06.home;

import java.util.Arrays;
import java.util.Random;

public class ArraySum implements Runnable {
    private int[] array = new int[100];
    private int sumOne = 0;
    private int sumTwo = 0;
    private long time = 0;


    public ArraySum() {
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public void simpleSum() {
        long start = System.nanoTime();

        for (int i = 0; i < array.length; i++) {
            sumOne += array[i];
        }
        long end = System.nanoTime();
        System.out.println("Simple sum time: " + (end - start) + " ms");
        System.out.println("Simple sum: " + sumOne);
    }

    public void randomFill() {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);
        }
    }

    @Override
    public void run() {
        long start = System.nanoTime();
        Thread thr = Thread.currentThread();
        int threadNum = Integer.parseInt(thr.getName().substring(7));
        if (threadNum == 0) {
            for (int i = 0; i < array.length / 4; i++) {
                sumTwo += array[i];
            }
        }
        if (threadNum == 1) {
            for (int i = array.length / 4; i < array.length / 2; i++) {
                sumTwo += array[i];
            }
        }
        if (threadNum == 2) {
            for (int i = array.length / 2; i < array.length / 2 + array.length / 4; i++) {
                sumTwo += array[i];
            }
        }
        if (threadNum == 3) {
            for (int i = array.length / 2 + array.length / 4; i < array.length; i++) {
                sumTwo += array[i];
            }
        }
        long end = System.nanoTime();
        time += (end - start);
        if (threadNum == 3) {
            System.out.println("Threads sum time: " + time + " ms");
            System.out.println(sumTwo);
        }
    }

    @Override
    public String toString() {
        return "ArraySum{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}

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