package com.milo.ms.web.mappers;

import com.milo.brewery.model.CustomerDto;
import com.milo.ms.domain.Customer;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface CustomerMapper {
    CustomerDto customerToDto(Customer customer);

    Customer dtoToCustomer(Customer dto);
}