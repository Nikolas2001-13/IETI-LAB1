package edu.eci.lab1.exception;

public class UserException extends Exception{

    public static final String USER_NOT_FOUND = "Usuario no encontrado";

    public UserException(final String message) {
        super(message);
    }

}
