package com.example.account.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Set;
@Getter
@Setter
public class AccountDto {
    String id;
    BigDecimal balance;
    CustomerDto accountCustomerDto;
    Set<TransactionDto> transactions;

    public AccountDto(String id, BigDecimal balance, com.example.account.dto.AccountCustomerDto accountCustomerDto, Set<TransactionDto> transactions) {
        this.id = id;
        this.balance = balance;
        accountCustomerDto = accountCustomerDto;
        this.transactions = transactions;
    }

}
