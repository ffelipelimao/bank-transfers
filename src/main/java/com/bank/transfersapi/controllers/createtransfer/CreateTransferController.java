package com.bank.transfersapi.controllers.createtransfer;

import com.bank.transfersapi.controllers.errors.HandlerError;
import com.bank.transfersapi.entities.Transfer;
import com.bank.transfersapi.errors.EmptyFromAccountException;
import com.bank.transfersapi.errors.EmptyToAccountException;
import com.bank.transfersapi.usecases.createtransfer.ICreateTransferUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transfers")
public class CreateTransferController {
    @Autowired
    ICreateTransferUseCase createTransferUseCase;

    @PostMapping()
    public ResponseEntity<?> create(@RequestBody Transfer transfer) throws Exception {
        try {

            Transfer transferCreated = createTransferUseCase.create(transfer);
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(transferCreated);

        } catch (EmptyToAccountException | EmptyFromAccountException e) {
           return ResponseEntity
               .status(HttpStatus.BAD_REQUEST)
               .body(new HandlerError(HttpStatus.BAD_REQUEST, e.getMessage()));
       }
    }
}
