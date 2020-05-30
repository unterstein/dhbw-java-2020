package kapitel5;

public class MeineEigeneException extends RuntimeException {
    public MeineEigeneException(String message) {
        super(message);
    }

    public MeineEigeneException(String message, Throwable cause) {
        super(message, cause);
    }
}
