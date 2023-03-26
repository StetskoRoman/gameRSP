package com.rv.gamersp.exceptions;

public class GameExceptions extends Exception {

    public GameExceptions() {
    }

    public GameExceptions(String message) {
        super(message);
    }

    public GameExceptions(String message, Throwable cause) {
        super(message, cause);
    }

    public GameExceptions(Throwable cause) {
        super(cause);
    }
}
