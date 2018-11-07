package lesson01.school;

public class Main {
    public static void main(String[] args) {

        Car carOne = new Car();
        carOne.setColor("Green");
        carOne.setWeight(2000);
        carOne.setYear(1980);

//        Car carTwo = new Car();
//        carTwo.color = "Red";
//        carTwo.year = 2000;
//        carTwo.weight = 1000;

//        carOne.setYear(1981);
//        carOne.beep();


        System.out.println();
//        carTwo.print();
        System.out.println();


        Car carThree = new Car("Blue", 2500, 1950);
        System.out.println(carOne);
        System.out.println(carThree);

    }

}
