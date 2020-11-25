package io.aranea.banking.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Currency {

    @Id
    private UUID uuid;

    private String code;
}
