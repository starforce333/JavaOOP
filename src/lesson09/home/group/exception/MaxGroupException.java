package lesson09.home.group.exception;

public class MaxGroupException extends Exception {

    @Override
    public String getMessage() {
        return "Go to another group. This is full!";
    }
}