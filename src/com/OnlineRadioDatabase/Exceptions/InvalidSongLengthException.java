package com.OnlineRadioDatabase.Exceptions;

public class InvalidSongLengthException extends InvalidSongException {
    public InvalidSongLengthException() {
    }

    public InvalidSongLengthException(String message) {
        super(message);
    }

    public InvalidSongLengthException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidSongLengthException(Throwable cause) {
        super(cause);
    }

    public InvalidSongLengthException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
