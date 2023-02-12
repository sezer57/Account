package com.example.account.dto;

import com.example.account.model.Transaction;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TransactionDto {
    String id;
    Transaction.TransactionType transactionType= Transaction.TransactionType.INITIAL;
    BigDecimal amount;
    String transactionDate = String.valueOf(LocalDateTime.now());

    public TransactionDto(String id, Transaction.TransactionType transactionType, BigDecimal amount, String transactionDate) {
        this.id = id;
        this.transactionType = transactionType;
        this.amount = amount;
        this.transactionDate = transactionDate;
    }
}
