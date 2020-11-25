package io.aranea.banking.dao.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.UUID;

/**
 * Local bank client
 */
@Entity
public class BankClientEntity {

    @Id
    private UUID uuid;

    private String login;

    private String passphrase;

    @OneToOne
    private PersonEntity person;
}
