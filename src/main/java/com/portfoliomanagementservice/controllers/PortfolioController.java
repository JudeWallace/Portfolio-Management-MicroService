package com.portfoliomanagementservice.controllers;

import com.portfoliomanagementservice.dto.NewAssetDTO;
import com.portfoliomanagementservice.model.Portfolio;
import com.portfoliomanagementservice.repository.PortfolioRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.sound.sampled.Port;
import java.util.List;

@RestController
@RequestMapping("/portfolio/")
public class PortfolioController {

    private final PortfolioRepository portfolioRepository;

    public PortfolioController(PortfolioRepository portfolioRepository) {
        this.portfolioRepository = portfolioRepository;
    }


    @GetMapping
    public ResponseEntity<String> addNewAssetToUsersPortfolio() {
        Portfolio portfolio = new Portfolio();
        portfolio.setUserId(1);
        portfolio.setTickerSymbol("TTT");
        portfolio.setAssetName("test");
        portfolio.setEntryPrice(30000.00);
        portfolio.setDateOfPurchase("2023");
        portfolioRepository.save(portfolio);
        return new ResponseEntity<>("New asset added to the users portfolio", HttpStatus.OK);
    }

    @PostMapping("portfolio-entry")
    public ResponseEntity<String> addNewEntryToUsersPortfolio(@RequestBody NewAssetDTO newPortfolioEntry) {
        Portfolio entry = new Portfolio();
        entry.setUserId(newPortfolioEntry.userId());
        return new ResponseEntity<>("New entry added", HttpStatus.OK);
    }

    @GetMapping("users-portfolio/{id}")
    public ResponseEntity<List<Portfolio>> getUsersEntirePortfolio(@PathVariable("id") Integer id) {
        return new ResponseEntity<>(portfolioRepository.getUsersPortfolio(id), HttpStatus.OK);
    }


}
