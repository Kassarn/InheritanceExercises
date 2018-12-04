package com.OnlineRadioDatabase.Exceptions;

public class InvalidSongNameException extends InvalidSongException {
    public InvalidSongNameException() {
    }

    public InvalidSongNameException(String message) {
        super(message);
    }

    public InvalidSongNameException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidSongNameException(Throwable cause) {
        super(cause);
    }

    public InvalidSongNameException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
