package com.OnlineRadioDatabase.Exceptions;

public class InvalidArtistNameException extends InvalidSongException {
    public InvalidArtistNameException() {
    }

    public InvalidArtistNameException(String message) {
        super(message);
    }

    public InvalidArtistNameException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidArtistNameException(Throwable cause) {
        super(cause);
    }

    public InvalidArtistNameException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
