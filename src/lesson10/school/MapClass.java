package lesson10.school;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MapClass {
    public static void main(String[] args) {

        Random rn = new Random();
        Integer[] array = new Integer[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = rn.nextInt(10);
        }

        Map<Integer, Integer> stat = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            Integer temp = stat.get(array[i]);
            if (temp == null) {
                stat.put(array[i], 1);
            } else {
                stat.put(array[i], temp + 1);
            }
        }
        System.out.println(stat);

    }
}