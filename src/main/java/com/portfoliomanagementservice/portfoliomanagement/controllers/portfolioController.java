package com.portfoliomanagementservice.portfoliomanagement.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/portfolio/")
public class portfolioController {

    @PostMapping
    public ResponseEntity<String> addNewAssetToUsersPortfolio(@RequestBody String assetDetails) {
        return new ResponseEntity<>("", HttpStatus.OK);
    }
}
