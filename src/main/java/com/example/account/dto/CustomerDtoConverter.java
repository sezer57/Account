package com.example.account.dto;

import com.example.account.model.Customer;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class CustomerDtoConverter {

    private final CustomerAccountDtoConverter converter  ;

    public CustomerDtoConverter(CustomerAccountDtoConverter converter) {
        this.converter = converter;
    }

    public AccountCustomerDto convertToAccountCustomer(Customer from){
        if(from==null)
        {
            System.out.println("null");
            return new AccountCustomerDto("asdf","asdf","asdf");
        }
        System.out.println(from.getId()+from.getName()+from.getSurname());
        return new AccountCustomerDto(from.getId(),from.getName(),from.getSurname());
    }
    public CustomerDto convertToCustomerDto(Customer from){
        return new CustomerDto(
                from.getId(),
                from.getName(),
                from.getSurname(),
                from.getAccounts().stream().map(converter::convert).collect(Collectors.toSet())
                );
    }
}
