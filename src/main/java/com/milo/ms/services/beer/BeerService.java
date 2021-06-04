package com.milo.ms.services.beer;

import com.milo.ms.web.model.BeerDto;

import java.util.Optional;
import java.util.UUID;

public interface BeerService {

    Optional<BeerDto> getBeerById(UUID uuid);
    Optional<BeerDto> getBeerByUpc(String upc);

}
