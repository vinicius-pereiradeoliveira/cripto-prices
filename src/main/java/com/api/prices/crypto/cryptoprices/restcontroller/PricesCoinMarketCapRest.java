package com.api.prices.crypto.cryptoprices.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.api.prices.crypto.cryptoprices.service.PriceService;

@RestController
@RequestMapping("/query/prices/crypto")
public class PricesCoinMarketCapRest {
	
	@Autowired
	private PriceService priceService;
	
	@GetMapping(value="/{id}")
	public ResponseEntity<?> getPrices(@PathVariable String id){
		return ResponseEntity.ok(priceService.getInformation(id).getBody()); 
	}	
	
	@PostMapping(value="alert/{id}")
	public ResponseEntity<?> enableAlertPrices(@PathVariable String id, @RequestParam Double valueAlert, @RequestParam Boolean enableDisable){
		return ResponseEntity.ok(priceService.enableDisableAlert(id, 20.00, enableDisable)); 
	}
}
