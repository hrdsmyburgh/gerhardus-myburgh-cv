public class InvalidAccountNumberException extends RuntimeException {
    public InvalidAccountNumberException() {
        this("The number is invalid");
    }

    public InvalidAccountNumberException(String message) {
        super(message);
    }
}