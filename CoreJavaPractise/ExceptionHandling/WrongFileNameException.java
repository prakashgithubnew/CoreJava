package CoreJavaPractise.ExceptionHandling;

public class WrongFileNameException extends Exception {
    public WrongFileNameException(String errorMessage) {
        super(errorMessage);
    }
}
