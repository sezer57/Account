package com.example.account.dto;

import com.example.account.model.Account;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class AccountDtoConverter {

    private final CustomerDtoConverter customerDtoConverter;
    private final transactionDtoConverter  transactionDtoConverter;

    public AccountDtoConverter(CustomerDtoConverter customerDtoConverter, com.example.account.dto.transactionDtoConverter transactionDtoConverter) {
        this.customerDtoConverter = customerDtoConverter;
        this.transactionDtoConverter = transactionDtoConverter;
    }

    public AccountDto convert(Account from ){
        return new AccountDto(from.getId(),
                from.getBalance(),
                customerDtoConverter.convertToAccountCustomer(from.getCustomer()),
                from.getTransactions()
                        .stream()
                        .map(transactionDtoConverter::convert)
                        .collect(Collectors.toSet()));
    }
}
