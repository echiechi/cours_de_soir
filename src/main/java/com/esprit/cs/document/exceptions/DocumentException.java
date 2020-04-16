package com.esprit.cs.document.exceptions;

public class DocumentException extends Exception {

    public DocumentException(String message) {
        super(message);
    }

    public DocumentException(String message, Throwable cause) {
        super(message, cause);
    }
}
