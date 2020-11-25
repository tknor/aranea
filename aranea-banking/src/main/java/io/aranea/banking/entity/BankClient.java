package io.aranea.banking.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

/**
 * Local bank client
 */
@Entity
public class BankClient {

    @Id
    private UUID uuid;

    private String login;

    private String passphrase;

//    private Person person;
}
