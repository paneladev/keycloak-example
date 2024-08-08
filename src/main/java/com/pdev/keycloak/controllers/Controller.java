package com.pdev.keycloak.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping
    @PreAuthorize("hasRole('ADMIN')")
    public String hello() {
        return "Hello World";
    }
}
