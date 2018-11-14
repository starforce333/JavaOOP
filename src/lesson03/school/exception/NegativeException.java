package lesson03.school.exception;

public class NegativeException extends Exception {


    @Override
    public String getMessage() {
        return "Give positive value";
    }
}
