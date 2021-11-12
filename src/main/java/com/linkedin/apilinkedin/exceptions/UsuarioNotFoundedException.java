package com.linkedin.apilinkedin.exceptions;

public class UsuarioNotFoundedException extends RuntimeException {
    public UsuarioNotFoundedException(String s) {
        super(s);
    }

    public UsuarioNotFoundedException(String s, Throwable error) {
        super(s, error);
    }
}
