package lesson04.school;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Comp comp = new Comp("Core i7", 32);

        FlashDrive flashOne = new FlashDrive("Kingston", 8);
        FlashDrive flashTwo = new FlashDrive("Samsung", 4);
        FlashDrive flashThree = new FlashDrive("Apacer", 16);
        FlashDrive flashFour = new FlashDrive("Transcend", 32);

        FlashDrive[] array = new FlashDrive[]{flashOne, flashTwo, flashThree, flashFour};

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println();

        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println();
        comp.connectToUsb(flashOne);
        System.out.println();

        Arrays.sort(array, (a, b) -> a.getVendor().compareTo(b.getVendor()));

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
        System.out.println();

    }
}
