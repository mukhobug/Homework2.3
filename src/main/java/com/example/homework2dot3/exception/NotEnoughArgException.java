package com.example.homework2dot3.exception;

public class NotEnoughArgException extends IllegalArgumentException {
    public NotEnoughArgException() {
    }

    public NotEnoughArgException(String s) {
        super(s);
    }

    public NotEnoughArgException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotEnoughArgException(Throwable cause) {
        super(cause);
    }
}
