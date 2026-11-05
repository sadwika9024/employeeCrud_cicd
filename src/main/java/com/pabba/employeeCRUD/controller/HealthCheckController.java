package com.pabba.employeeCRUD.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    @GetMapping("/")
    public ResponseEntity<String> healthCheckApi() {
        return ResponseEntity.ok("it is working..!!!");
    }
}