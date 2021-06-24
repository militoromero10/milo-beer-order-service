package com.milo.ms.services;

import com.milo.brewery.model.BeerOrderDto;
import com.milo.ms.domain.BeerOrder;

import java.util.UUID;

public interface BeerOrderManager {
    BeerOrder newBeerOrder(BeerOrder beerOrder);
    void processValidationResult(UUID beerOrderId, Boolean isValid);
    void beerOrderAllocationPassed(BeerOrderDto beerOrder);
    void beerOrderAllocationPendingInventory(BeerOrderDto beerOrder);
    void beerOrderAllocationFailed(BeerOrderDto beerOrder);
    void beerOrderPickedUp(UUID id);
}
