package com.example.account.dto;


import com.example.account.model.Account;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component


public class CustomerAccountDtoConverter {


    private final TransactionDtoConverter converter;

    public CustomerAccountDtoConverter(TransactionDtoConverter converter) {
        this.converter = converter;
    }

    public CustomerAccountDto convert(Account account){
        return new CustomerAccountDto(
                account.getId(),
                account.getBalance(),
                account.getTransactions().stream().map(converter::convert).collect(Collectors.toSet())
        );
    }
}
