package lesson07.school;

public class Action {


    private boolean isStop = false;
    private boolean turn = false;
    private String value;

    public Action() {
    }

    public void setStop(boolean stop) {
        isStop = stop;
    }

    public boolean isTurn() {
        return turn;
    }

    public void setTurn(boolean turn) {
        this.turn = turn;
    }

    public String getValue() {
        for (; turn == false; ) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        String temp = this.value;
        turn = false;
        notifyAll();
        System.out.println("String accepted -> " + this.value);
        return temp;
    }

    public void setValue(String value) {
        for (; turn == true; ) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        this.value = value;
        turn = true;
        System.out.println("Send String -> " + this.value);
        notifyAll();
    }


}
