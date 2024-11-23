package com.portfoliomanagementservice.dto;


public record NewAssetDTO(
        Integer userId,
        String tickerSymbol,
        String assetName,
        Double entryPrice,
        String boughtAt
) {}
