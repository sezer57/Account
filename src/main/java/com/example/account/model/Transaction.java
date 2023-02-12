package com.example.account.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Getter
@Setter
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    String id;
    @Enumerated(EnumType.STRING)
    TransactionType  transactionType= TransactionType.INITIAL;

    BigDecimal amount;
    String transactionDate = String.valueOf(LocalDateTime.now());

    @ManyToOne(fetch = FetchType.LAZY,optional = false,cascade = CascadeType.ALL)
    @JoinColumn(name = "account_id",nullable = false)
    Account account;


    public enum TransactionType{
        INITIAL,TRANSFER
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;
        return id.equals(that.id) && transactionType == that.transactionType && amount.equals(that.amount) && transactionDate.equals(that.transactionDate) && account.equals(that.account);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, transactionType, amount, transactionDate);
    }
}
