package com.example.account.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Getter
@Setter
@Table(name = "transaction")
public class Transaction {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;


    @Enumerated(EnumType.STRING)
    TransactionType  transactionType= TransactionType.INITIAL;

    BigDecimal amount;
    LocalDateTime transactionDate ;

    @ManyToOne(fetch = FetchType.LAZY,optional = false,cascade = CascadeType.ALL)
    @JoinColumn(name = "account_id",nullable = false)
    Account account;

    public Transaction() {

    }


    public enum TransactionType{
        INITIAL,TRANSFER
    }
    public Transaction(BigDecimal amount, Account account){
        this.id="";
        this.amount=amount;
        this.transactionDate=LocalDateTime.now();
        this.account=account;
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
