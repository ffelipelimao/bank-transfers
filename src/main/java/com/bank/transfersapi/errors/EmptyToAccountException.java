package com.bank.transfersapi.errors;

public class EmptyToAccountException extends Exception{
    public EmptyToAccountException(String message){
        super(message);
    }
}
