package com.example.account.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;
@Getter
@Setter
public class CustomerDto {
    String id;
    String name;
    String surname;
    Set<CustomerAccountDto> accounts;

    public CustomerDto(String id,
                       String name,
                       String surname,
                       Set<CustomerAccountDto> accounts) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.accounts = accounts;
    }
}
