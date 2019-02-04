package lottery;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[][] big = new int[100][12];
        int[] two = new int[91];
        int[] four = new int[91];

        for (int i = 0; i < 500; i++) {
            int[] three = addArray();
            for (int j = 0; j < three.length; j++) {
                four[three[j]]++;
            }
        }
        System.out.println("four");
        System.out.println(Arrays.toString(four));
        System.out.println();
        System.out.println("four sort");
        indexSort(four);
        System.out.println();

        for (int i = 0; i < big.length; i++) {
            int[] tmp = addArray();
            for (int j = 0; j < 12; j++) {
                big[i][j] = tmp[j];
            }
        }
        two = sort(big, two);
        System.out.println(Arrays.toString(two));

        System.out.println("index sort");
        indexSort(two);
    }

    private static void indexSort(int[] two) {
        List<Integer> fin = new ArrayList<>();
        int indexOfMax = 0;
        for (int i = 0; i < 12; i++) {
            for (int j = 1; j < two.length; j++) {
                if (two[j] > indexOfMax) {
                    indexOfMax = j;
                }
            }
            fin.add(indexOfMax);
            two[indexOfMax] = 0;
            indexOfMax = 0;
        }
        System.out.println(fin);
    }

    static boolean checkDuplicates(int[] lottery, int random) {
        boolean status = false;
        for (int i = 0; i < lottery.length; i++) {
//            if (lottery[i] == random || lottery[i] == random + 1 || lottery[i] == random - 1) {
            if (lottery[i] == random) {
                status = true;
                return status;
            }
        }
        return status;
    }

    static int[] addArray() {
        int[] lot = new int[12];
        int num;
        for (int i = 0; i < lot.length; i++) {
            Random rnd = new Random();
            num = rnd.nextInt(90) + 1;
            if (checkDuplicates(lot, num)) {
                i--;
                continue;
            } else {
                lot[i] = num;
            }
        }
        return lot;
    }

    static int[] sort(int[][] lot, int[] two) {
        for (int i = 0; i < lot.length; i++) {
            for (int j = 0; j < lot[i].length; j++) {
                two[lot[i][j]]++;
            }
        }
        return two;
    }
}
