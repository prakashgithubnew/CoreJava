package CoreJavaPractise.HandsOn.ExceptionHandling;

class InsufficientInventoryException extends RuntimeException {
    public InsufficientInventoryException(String message) {
        super(message);
    }
}