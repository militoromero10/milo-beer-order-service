package com.milo.ms.web.model;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@EqualsAndHashCode(callSuper = true)
public class OrderStatusUpdate extends BaseItem {

    private UUID orderId;
    private String customerRef;
    private String orderStatus;

    public OrderStatusUpdate(){

    }

    @Builder
    public OrderStatusUpdate(UUID id, Integer version, OffsetDateTime createdDate, OffsetDateTime lastModifiedDate,
                             UUID orderId, String orderStatus, String customerRef) {
        super(id, version, createdDate, lastModifiedDate);
        this.orderId = orderId;
        this.orderStatus = orderStatus;
        this.customerRef = customerRef;
    }
}