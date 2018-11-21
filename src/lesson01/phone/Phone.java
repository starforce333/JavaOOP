package lesson01.phone;

public class Phone {
    private String number;
    private String status;
    private Network ks = new Network();


    public Phone(String number, String status) {
        this.number = number;
        this.status = status;

    }

    public Phone() {
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void call(String number) {
        for (int i = 0; i < ks.getNumbers().length; i++) {
            if (ks.getNumbers()[i] != null && ks.getNumbers()[i].getNumber().equals(number)) {
                System.out.println("Incoming call");
                return;
            }
        }
        System.out.println("We don't have such user!");
    }

    public void register() {
        this.status = "online";
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                '\'' + '}';
    }
}