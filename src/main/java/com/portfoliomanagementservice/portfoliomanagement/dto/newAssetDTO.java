package com.portfoliomanagementservice.portfoliomanagement.dto;

public record newAssetDTO(
        String tickerSymbol,
        String assetName,
        Long entryPrice
) {}
