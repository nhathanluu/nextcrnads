package vn.unikcore.nextcrmads.exception;

public class UnAuthorized extends RuntimeException {
    public UnAuthorized () {
        super();
    }

    public UnAuthorized (String message) {
        super(message);
    }

    public UnAuthorized (String message, Throwable cause) {
        super(message, cause);
    }

    public UnAuthorized (Throwable cause) {
        super(cause);
    }
}