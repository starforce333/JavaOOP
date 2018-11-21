package lesson01.phone;

public class Main {
    public static void main(String[] args) {

        Phone one = new Phone("0671234567", "offline");
        Phone two = new Phone("0671234561", "offline");
        Phone three = new Phone("0671234562", "offline");
        Phone four = new Phone("0671234565", "offline");

        Network kyivstar = new Network();
        kyivstar.add(one);
        kyivstar.add(two);
        kyivstar.add(three);
        one.register();
        two.register();
        one.call(two.getNumber());
        two.call(three.getNumber());
        three.call(four.getNumber());
        System.out.println(kyivstar);
    }
}