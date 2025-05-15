package org.example;

public class InvalidShippingInfoException extends RuntimeException {
    public InvalidShippingInfoException(String message) {
        super(message);
    }
}
