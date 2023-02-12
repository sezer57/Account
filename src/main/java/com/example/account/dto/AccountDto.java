package com.example.account.dto;

import java.util.Set;

public class AccountDto {
    String id;
    int balance;
    CustomerDto accountCustomerDto;
    Set<TransactionDto> transactions;

    public AccountDto(String id, int balance, com.example.account.dto.AccountCustomerDto accountCustomerDto, Set<TransactionDto> transactions) {
        this.id = id;
        this.balance = balance;
        accountCustomerDto = accountCustomerDto;
        this.transactions = transactions;
    }
}
