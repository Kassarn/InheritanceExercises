package com.OnlineRadioDatabase.Exceptions;

public class InvalidSongException extends RuntimeException {
    public InvalidSongException() {
    }

    public InvalidSongException(String message) {
        super(message);
    }

    public InvalidSongException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidSongException(Throwable cause) {
        super(cause);
    }

    public InvalidSongException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
