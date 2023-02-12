package com.example.account.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;
import java.util.Set;

@Entity
@Getter
@Setter
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    String id;

    int balance;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id" , nullable = false)
    Customer customer;

    @OneToMany(mappedBy = "account",fetch = FetchType.LAZY)
    Set<Transaction> transactions;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return balance == account.balance && id.equals(account.id) && customer.equals(account.customer) && transactions.equals(account.transactions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, balance, customer);
    }
}
