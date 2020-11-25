package io.aranea.banking.rest;

import io.aranea.banking.rest.dto.PersonDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonApi {

    @GetMapping
    public List<PersonDto> people() {
        return Collections.emptyList();
    }
}
