package com.milo.ms.domain;

public enum BeerOrderStatusEnum {
    NEW, VALIDATED, VALIDATE_PENDING, VALIDATION_EXCEPTION,
    ALLOCATION_PENDING, ALLOCATED, ALLOCATION_EXCEPTION, CANCELLED,
    PENDING_INVENTORY, PICKED_UP, DELIVERED, DELIVERY_EXCEPTION
}
