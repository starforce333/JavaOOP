package lesson09.school;

//import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        SomeClass<Integer> a = new SomeClass<>(100);

//        a.setSomeField("150");
        int n = a.getSomeField() + 20;
        System.out.println(n);

        SomeClass<String> b = new SomeClass<>("Hello world");


// no     SomeClass <Scanner> c = new SomeClass<Scanner>(new Scanner(System.in));

        Integer[] array = new Integer[]{7, 2, 5, 9};
        Integer max = getMax(array);
        System.out.println(max);

//        String[] str = new String[] {"one", "two", "zero", "three"};
//        System.out.println(getMax(str));


    }

    public static <T extends Comparable<T>> T getMax(T[] array) {
        T max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max.compareTo(array[i]) < 0) {
                max = array[i];
            }
        }
        return max;
    }
}