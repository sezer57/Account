package com.example.account.dto;

import com.example.account.model.Transaction;

public class transactionDtoConverter {
    public TransactionDto convert(Transaction from){
        return new TransactionDto(from.getId(),
                from.getTransactionType(),from.getAmount(),
                from.getTransactionDate());
    }
}
