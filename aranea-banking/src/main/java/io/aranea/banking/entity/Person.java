package io.aranea.banking.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Person {

    @Id
    private UUID uuid;

    private String firstName;

    private String lastName;
}
