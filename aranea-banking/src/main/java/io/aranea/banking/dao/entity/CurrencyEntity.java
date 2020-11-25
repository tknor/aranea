package io.aranea.banking.dao.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class CurrencyEntity {

    @Id
    private UUID uuid;

    private String code;
}
