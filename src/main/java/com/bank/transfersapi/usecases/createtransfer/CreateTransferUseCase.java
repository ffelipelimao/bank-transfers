package com.bank.transfersapi.usecases.createtransfer;

import com.bank.transfersapi.entities.Transfer;
import com.bank.transfersapi.errors.EmptyToAccountException;
import org.springframework.stereotype.Service;

@Service
public class CreateTransferUseCase implements ICreateTransferUseCase {

    public Transfer create(Transfer transfer) throws Exception {
        if (transfer.getToAccountId() == null){
            throw new EmptyToAccountException("to account is empty");
        }

        return new Transfer(
                transfer.getValue(),
                transfer.getFromAccountId(),
                transfer.getToAccountId());
    }
}
