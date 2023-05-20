package com.example.osisinfobytes_quiz_app.Exceptions;

public class UsernameNotFoundException extends Throwable {
    public UsernameNotFoundException(String userNotFound) {
        super("User Not found");
    }
}
