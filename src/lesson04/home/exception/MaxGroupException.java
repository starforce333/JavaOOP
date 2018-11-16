package lesson04.home.exception;

public class MaxGroupException extends Exception {

    @Override
    public String getMessage() {
        return "Go to another group. This is full!";
    }
}