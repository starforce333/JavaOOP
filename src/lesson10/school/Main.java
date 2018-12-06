package lesson10.school;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Map<Integer, String> myMap = new HashMap<>();

        myMap.put(2, "two");
        myMap.put(5, "five");
        myMap.put(1, "one");
        System.out.println(myMap);

        String temp = myMap.get(5);
        System.out.println(temp);

        myMap.put(2, "TWO");
        System.out.println(myMap);

        myMap.remove(2);
        System.out.println(myMap);

        Set<Integer> keys = myMap.keySet();
        for (Integer key : keys) {
            System.out.println(key + " => " + myMap.get(key));

        }
        System.out.println();
        myMap.forEach((key, value) -> System.out.println(key + " -> " + value));

        Set<Integer> mySet = new HashSet<>();


    }

}
