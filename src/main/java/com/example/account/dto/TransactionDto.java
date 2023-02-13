package com.example.account.dto;

import com.example.account.model.Transaction;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
@Getter
@Setter
public class TransactionDto {
    String id;
    Transaction.TransactionType transactionType= Transaction.TransactionType.INITIAL;
    BigDecimal amount;
    LocalDateTime transactionDate ;

    public TransactionDto(String id, Transaction.TransactionType transactionType, BigDecimal amount, LocalDateTime transactionDate) {
        this.id = id;
        this.transactionType = transactionType;
        this.amount = amount;
        this.transactionDate = transactionDate;
    }
}
