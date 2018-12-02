package lesson07.school;

public class Pull implements Runnable {

    private String pull = "Pull";
    private Action action;

    public Pull(Action action) {
        this.action = action;
    }

    @Override
    public void run() {
        action.setValue(pull);
    }
}
