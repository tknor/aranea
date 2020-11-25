package io.aranea.banking.dao.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.math.BigInteger;
import java.util.UUID;

/**
 * Local bank account
 */
@Entity
public class BankAccountEntity {

    @Id
    private UUID uuid;

    @OneToOne
    private CurrencyEntity currency;

    private BigInteger amount;

    @ManyToOne
    private BankClientEntity owner;
}
