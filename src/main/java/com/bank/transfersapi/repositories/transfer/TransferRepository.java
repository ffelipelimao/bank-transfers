package com.bank.transfersapi.repositories.transfer;


import com.bank.transfersapi.entities.Transfer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TransferRepository extends JpaRepository<Transfer, Long> {}
