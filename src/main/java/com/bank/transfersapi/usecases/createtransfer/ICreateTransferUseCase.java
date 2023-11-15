package com.bank.transfersapi.usecases.createtransfer;

import com.bank.transfersapi.entities.Transfer;

public interface ICreateTransferUseCase {
    Transfer create(Transfer transfer) throws Exception;
}
