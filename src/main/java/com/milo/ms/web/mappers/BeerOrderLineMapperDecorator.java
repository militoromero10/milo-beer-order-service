package com.milo.ms.web.mappers;

import com.milo.ms.domain.BeerOrderLine;
import com.milo.ms.services.beer.BeerService;
import com.milo.ms.web.model.BeerDto;
import com.milo.ms.web.model.BeerOrderLineDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.Optional;

public abstract class BeerOrderLineMapperDecorator implements BeerOrderLineMapper {
    private BeerService beerService;
    private BeerOrderLineMapper beerOrderLineMapper;

    @Autowired
    public void setBeerService(BeerService beerService) {
        this.beerService = beerService;
    }

    @Autowired
    @Qualifier("delegate")
    public void setBeerOrderLineMapper(BeerOrderLineMapper beerOrderLineMapper) {
        this.beerOrderLineMapper = beerOrderLineMapper;
    }

    @Override
    public BeerOrderLineDto beerOrderLineToDto(BeerOrderLine line){
        BeerOrderLineDto beerOrderLineDto = beerOrderLineMapper.beerOrderLineToDto(line);
        Optional<BeerDto> beerDtoOptional = beerService.getBeerByUpc(line.getUpc());

        beerDtoOptional.ifPresent( beerDto -> {
            beerOrderLineDto.setBeerName(beerDto.getBeerName());
            beerOrderLineDto.setBeerStyle(beerDto.getBeerStyle());
//            beerOrderLineDto.setUpc(beerDto.getUpc());
            beerOrderLineDto.setPrice(beerDto.getPrice());
            beerOrderLineDto.setBeerId(beerDto.getId());
        });

        return  beerOrderLineDto;

    }
}
