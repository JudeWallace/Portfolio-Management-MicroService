package com.portfoliomanagementservice.repository;

import com.portfoliomanagementservice.model.Portfolio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PortfolioRepository extends JpaRepository<Portfolio, Integer> {

    @Query(value = "SELECT * FROM portfolios p WHERE p.user_id = :userId", nativeQuery = true)
    List<Portfolio> getUsersPortfolio(@Param("userId") Integer userId);
}


