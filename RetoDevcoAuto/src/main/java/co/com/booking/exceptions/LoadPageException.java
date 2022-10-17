package co.com.booking.exceptions;

import net.serenitybdd.core.exceptions.SerenityManagedException;

public class LoadPageException extends SerenityManagedException {

    public static final String FAILED_PAGE_LOAD = "Fail opening the page";
    public LoadPageException(String message, Throwable testErrorException) {
        super(message, testErrorException);
    }
}
