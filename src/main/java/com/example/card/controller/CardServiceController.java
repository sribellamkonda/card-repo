package com.example.card.controller;


import com.example.card.model.CardInfo;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

/**
 * This controller class is used to process user input.
 */
@RestController
@RequestMapping("/card")
public class CardServiceController {


    @GetMapping
    public ResponseEntity<List<String>> getCards() {
        return new ResponseEntity<>(List.of("4234123412341234", "4100123412341234"), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<String> save(final @Valid @RequestBody CardInfo cardInfo) {
        return new ResponseEntity<>(UUID.randomUUID().toString(), HttpStatus.CREATED);
    }
}