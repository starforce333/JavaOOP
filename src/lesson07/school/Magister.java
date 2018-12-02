package lesson07.school;

public class Magister implements Runnable {

    int pages = 100;
    String text;
    private Action action;


    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            text = action.getValue();
            System.out.println(text);
        }
    }

}


