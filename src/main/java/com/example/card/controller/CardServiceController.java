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
        return new ResponseEntity<>(List.of("340000000000012", "6011000000001111", "2221000000000000",
                "4026000000000000"), HttpStatus.OK);
    }

    @GetMapping(path = "/{brand}")
    public ResponseEntity<List<String>> getCards(@PathVariable String brand) {
        if ("mc".equals(brand)) {
            return new ResponseEntity<>(List.of("2221000000000000", "2720000000000001"), HttpStatus.OK);
        }
        return new ResponseEntity<>(List.of("Invalid Brand"), HttpStatus.BAD_REQUEST);
    }


    @PostMapping
    public ResponseEntity<String> save(final @Valid @RequestBody CardInfo cardInfo) {
        return new ResponseEntity<>(UUID.randomUUID().toString(), HttpStatus.CREATED);
    }
}