package com.ideaco.backend;

public class EmailNotValidException extends Exception{
    public EmailNotValidException(String error){
        System.out.println("Error "+error);
    }
}
