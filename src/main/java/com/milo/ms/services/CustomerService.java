package com.milo.ms.services;

import com.milo.brewery.model.CustomerPagedList;
import org.springframework.data.domain.Pageable;

public interface CustomerService {
    CustomerPagedList listCustomers(Pageable pageable);
}
