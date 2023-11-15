package com.bank.transfersapi.usecases.createtransfer;

import com.bank.transfersapi.entities.Transfer;
import com.bank.transfersapi.errors.EmptyFromAccountException;
import com.bank.transfersapi.errors.EmptyToAccountException;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CreateTransferUseCase implements ICreateTransferUseCase {

    public Transfer create(Transfer transfer) throws Exception {
        if (transfer.getToAccountId() == null){
            throw new EmptyToAccountException("to account is empty");
        }

        if (transfer.getFromAccountId() == null){
            throw new EmptyFromAccountException("from account is empty");
        }

        transfer.setId(UUID.randomUUID().toString());

        return transfer;
    }
}
