package io.aranea.banking.dao;

import io.aranea.banking.dao.entity.PersonEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface PersonRepository extends CrudRepository<PersonEntity, UUID> {

}
