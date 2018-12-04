package com.OnlineRadioDatabase.Exceptions;

public class InvalidSongSecondsException extends InvalidSongLengthException {
    public InvalidSongSecondsException() {
    }

    public InvalidSongSecondsException(String message) {
        super(message);
    }

    public InvalidSongSecondsException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidSongSecondsException(Throwable cause) {
        super(cause);
    }

    public InvalidSongSecondsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
