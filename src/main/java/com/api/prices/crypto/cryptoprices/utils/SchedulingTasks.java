package com.api.prices.crypto.cryptoprices.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.api.prices.crypto.cryptoprices.repository.PricesRepository;
import com.api.prices.crypto.cryptoprices.service.PriceService;

@Component
@EnableScheduling
public class SchedulingTasks {
    
    @Autowired
    private PriceService priceService;
    
    @Autowired
    private PricesRepository pricesRepository;
    
    private final long SEGUNDO = 1000;
    private final long MINUTO = SEGUNDO * 60;
    
    @Scheduled(fixedDelay = MINUTO)
    public void reportPrice() {
    	if(pricesRepository.getValueAlert().isStatus()) {
    		priceService.initMonitoringOfPrice(pricesRepository.getValueAlert().getPrice(), pricesRepository.getValueAlert().getId());
    	}
    }
	
}
