package io.aranea.banking.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/authentication")
public class AuthenticationApi {

    @PostMapping("/loginAsClient")
    public String loginAsClient() {
        return "you are logged in as client";
    }

    @PostMapping("/loginAsManager")
    public String loginAsManager() {
        return "you are logged in as manager";
    }

    @PostMapping("/logout")
    public String logout() {
        return "you are logged out";
    }
}
