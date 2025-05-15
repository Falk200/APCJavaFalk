package org.example;

public class MissingShippingInfoException extends RuntimeException {
    public MissingShippingInfoException(String message) {
        super(message);
    }
}
