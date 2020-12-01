package com.vicensvives.digital.javahiringtest.exceptions;

import lombok.Data;

@Data
public class InvalidDataValueException extends Exception{

    private int errorCode;
    private String errorMessage;

    public InvalidDataValueException(Throwable throwable) {
        super(throwable);
    }

    public InvalidDataValueException(String msg, Throwable throwable) {
        super(msg, throwable);
    }

    public InvalidDataValueException(String msg) {
        super(msg);
    }

    public InvalidDataValueException(String message, int errorCode) {
        super();
        this.errorCode = errorCode;
        this.errorMessage = message;
    }
}
