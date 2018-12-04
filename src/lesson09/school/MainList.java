package lesson09.school;

import java.util.*;

public class MainList {

    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();

        myList.add(4);
        myList.add(-2);
//        myList.add(7);
        myList.add(5);
        myList.add(-5);

        System.out.println(myList);

        myList.add(1, 10);
        System.out.println(myList);

        Integer temp = myList.get(2);
        System.out.println(temp);

        myList.remove(0);
        System.out.println(myList);

        myList.set(1, 10155);
        System.out.println(myList);

        List<Integer> a = myList.subList(0, 2);
        System.out.println(a);

        Collections.sort(myList);
        System.out.println(myList);

//        Collections.shuffle(myList);
//        System.out.println(myList);

        for (Integer element : myList) {
            System.out.println(element);
        }
        System.out.println();

        Iterator<Integer> itr = myList.iterator();
        for (; itr.hasNext(); ) {
            Integer elem = itr.next();

            if (elem<0){
                itr.remove();
            }
        }
        System.out.println(myList);
    }

    public static void print(List<? extends Number> list) {
        System.out.println(list);
    }
}
