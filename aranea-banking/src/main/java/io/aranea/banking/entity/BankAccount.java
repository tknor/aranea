package io.aranea.banking.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigInteger;
import java.util.UUID;

/**
 * Local bank account
 */
@Entity
public class BankAccount {

    @Id
    private UUID uuid;

//    private Currency currency;

    private BigInteger amount;

//    private BankClient owner;
}
