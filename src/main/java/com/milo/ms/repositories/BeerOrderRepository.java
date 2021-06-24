package com.milo.ms.repositories;

import com.milo.ms.domain.BeerOrder;
import com.milo.ms.domain.BeerOrderStatusEnum;
import com.milo.ms.domain.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;

import javax.persistence.LockModeType;
import java.util.List;
import java.util.UUID;

public interface BeerOrderRepository extends JpaRepository<BeerOrder, UUID> {
    Page<BeerOrder> findAllByCustomer(Customer customer, Pageable pageable);

    List<BeerOrder> findAllByOrderStatus(BeerOrderStatusEnum beerOrderStatusEnum);

//    @Lock(LockModeType.PESSIMISTIC_WRITE)
//    BeerOrder findOneById(UUID id);
}
