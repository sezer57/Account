package com.example.account.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;
import java.util.Set;

@Entity
@Getter
@Setter
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    String id;

    String name;
    String surname;

    @OneToMany(mappedBy = "customer",fetch = FetchType.LAZY)
    Set<Account> accounts;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id.equals(customer.id) && name.equals(customer.name) && surname.equals(customer.surname) && accounts.equals(customer.accounts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname);
    }
}
