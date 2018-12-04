package com.OnlineRadioDatabase.Exceptions;

public class InvalidSongMinutesException extends InvalidSongLengthException {
    public InvalidSongMinutesException() {
    }

    public InvalidSongMinutesException(String message) {
        super(message);
    }

    public InvalidSongMinutesException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidSongMinutesException(Throwable cause) {
        super(cause);
    }

    public InvalidSongMinutesException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
