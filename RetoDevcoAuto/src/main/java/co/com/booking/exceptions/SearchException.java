package co.com.booking.exceptions;

public class SearchException extends AssertionError {

    public static final String FAILED_SEARCH = "The search didn't return the expected results";

    public SearchException(String message, Throwable testErrorException) {
        super(message, testErrorException);
    }
}
