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
    AccountCustomerDto customer ;
    Set<TransactionDto> transactions;

    public AccountDto(String id,
                      BigDecimal balance,
                      AccountCustomerDto customer,
                      Set<TransactionDto> transactions) {

        this.id = id;
        this.balance = balance;
        this.customer = customer;
        this.transactions = transactions;
    }

}
