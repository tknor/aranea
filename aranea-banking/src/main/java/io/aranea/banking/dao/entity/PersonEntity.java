package io.aranea.banking.dao.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class PersonEntity {

    @Id
    private UUID uuid;

    private String firstName;

    private String lastName;
}
