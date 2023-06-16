package com.alcme.backend.businessrule.exception;

public class ValidationException extends RuntimeException {
     public ValidationException(String message) {
        super(message);
    }
}
