package com.example.account.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Set;

@Getter
@Setter
public class CustomerAccountDto {
    String id;
    BigDecimal balance;
    Set<TransactionDto> transactions;

}
