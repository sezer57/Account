package com.example.account.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountCustomerDto {
    String id;
    String name;
    String surname;

    public AccountCustomerDto(String id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }
}
