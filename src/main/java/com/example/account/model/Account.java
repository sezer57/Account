package com.example.account.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "account")
public class Account {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;

    BigDecimal balance;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id" , nullable = false)
    Customer customer;

    @OneToMany(mappedBy = "account",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    Set<Transaction> transactions;

    public Account() {

    }

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

    public Account(BigDecimal balance, Customer customer) {
        this.id="";
        this.balance = balance;
        this.customer = customer;
        this.transactions=new HashSet<>();
    }


}
