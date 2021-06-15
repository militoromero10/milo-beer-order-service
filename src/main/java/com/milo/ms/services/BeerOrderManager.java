package com.milo.ms.services;

import com.milo.ms.domain.BeerOrder;

import java.util.UUID;

public interface BeerOrderManager {
    BeerOrder newBeerOrder(BeerOrder beerOrder);
    void processValidationResult(UUID beerOrderId, Boolean isValid);

}
