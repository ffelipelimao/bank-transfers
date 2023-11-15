package com.bank.transfersapi.controllers.errors;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.http.HttpStatus;

import java.io.Serializable;
import java.util.List;

public class HandlerError implements Serializable {
    @JsonProperty("status")
    private HttpStatus status;
    @JsonProperty("message")
    private String message;

    public HandlerError(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }
}
