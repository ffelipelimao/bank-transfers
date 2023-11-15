package com.bank.transfersapi.errors;

public class EmptyToAccountException extends Exception{

    private String msg;

    public EmptyToAccountException(String message){
        super(message);
        this.msg = message;
    }
}
