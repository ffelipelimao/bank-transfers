package com.bank.transfersapi.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;


public class Transfer implements Serializable {
    @JsonProperty("id")
    private String id;
    @JsonProperty("value")
    private float value;
    @JsonProperty("from_account_id")
    private String fromAccountId;

    @JsonProperty("to_account_id")
    private String toAccountId;

    public Transfer(float value, String FromAccountId, String ToAccountId){
        this.id = UUID.randomUUID().toString();
        this.fromAccountId = FromAccountId;
        this.toAccountId = ToAccountId;
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public String getFromAccountId() {
        return fromAccountId;
    }

    public void setFromAccountId(String fromAccountId) {
        this.fromAccountId = fromAccountId;
    }

    public String getToAccountId() {
        return toAccountId;
    }

    public void setToAccountId(String toAccountId) {
        this.toAccountId = toAccountId;
    }



}
