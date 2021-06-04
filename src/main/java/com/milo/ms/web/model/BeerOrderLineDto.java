package com.milo.ms.web.model;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@EqualsAndHashCode(callSuper = true)
public class BeerOrderLineDto extends BaseItem {

    private String upc;
    private String beerName;
    private String beerStyle;
    private UUID beerId;
    private Integer orderQuantity = 0;
    private BigDecimal price;

    public BeerOrderLineDto() {

    }

    @Builder
    public BeerOrderLineDto(UUID id, Integer version, OffsetDateTime createdDate, OffsetDateTime lastModifiedDate,
                            String upc, String beerName, String beerStyle, UUID beerId, Integer orderQuantity, BigDecimal price) {
        super(id, version, createdDate, lastModifiedDate);
        this.upc = upc;
        this.beerStyle = beerStyle;
        this.beerName = beerName;
        this.beerId = beerId;
        this.orderQuantity = orderQuantity;
        this.price = price;
    }
}