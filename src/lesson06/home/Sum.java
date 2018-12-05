package lesson06.home;

public class Sum implements Runnable {
    private int[] array;
    private int begin;
    private int end;
    private int sum;

    public Sum(int[] array, int begin, int end) {
        super();
        this.array = array;
        this.begin = begin;
        this.end = end;
    }

    public Sum() {
        super();
    }



    public int getSum() {
        return sum;
    }

    @Override
    public void run() {
        for (int i = begin; i < end; i++) {
            this.sum += array[i];
        }
    }
}