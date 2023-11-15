package com.bank.transfersapi.errors;

public class EmptyFromAccountException extends Exception{
    public EmptyFromAccountException(String message){
        super(message);
    }
}
