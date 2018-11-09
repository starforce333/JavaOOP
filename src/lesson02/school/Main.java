package lesson02.school;

public class Main {
    public static void main(String[] args) {


        Cat catOne = new Cat(3, 6, true, "Milk", "Vaska", "Siam");

        catOne.getVoice();

        System.out.println(catOne);

//        Animals anim = catOne;
//
//        System.out.println(anim.getAge());
//
//        anim.getVoice();

        Animals[] zoo = new Animals[10];
        zoo[0] =catOne;

    }
}