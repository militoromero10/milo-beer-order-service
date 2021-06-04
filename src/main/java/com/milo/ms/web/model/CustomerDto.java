package com.milo.ms.web.model;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@EqualsAndHashCode(callSuper = true)
public class CustomerDto extends BaseItem {

    private String name;

    public CustomerDto(){

    }

    @Builder
    public CustomerDto(UUID id, Integer version, OffsetDateTime createdDate, OffsetDateTime lastModifiedDate, String name) {
        super(id, version, createdDate, lastModifiedDate);
        this.name = name;
    }

}