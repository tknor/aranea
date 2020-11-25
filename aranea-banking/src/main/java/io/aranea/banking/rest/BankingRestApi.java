package io.aranea.banking.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankingRestApi {

    @Value("${aranea.banking.version}")
    private String bankingVersion;

    @GetMapping("/hello")
    public String hello() {
        return String.format("Welcome to Aranea Banking (version: %s)", bankingVersion);
    }
}
