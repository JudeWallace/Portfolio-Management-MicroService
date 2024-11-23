package com.portfoliomanagementservice.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "portfolios")
public class Portfolio {

    @Id
    @SequenceGenerator(
            name = "portfolio_id_sequence",
            sequenceName = "portfolio_id_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "portfolio_id_sequence"
    )

    private Integer id;
    private Integer userId;
    private String tickerSymbol;
    private String assetName;
    private Double entryPrice;
    private String dateOfPurchase;
}
