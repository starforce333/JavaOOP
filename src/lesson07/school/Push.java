package lesson07.school;

public class Push implements Runnable {
    private String push = "Push";
    private Action action;

    public Push(Action action) {
        this.action = action;
    }

    @Override
    public void run() {
        action.setValue(push);
    }
}
