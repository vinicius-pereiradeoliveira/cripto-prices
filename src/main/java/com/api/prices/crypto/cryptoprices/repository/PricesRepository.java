package com.api.prices.crypto.cryptoprices.repository;

import org.springframework.stereotype.Repository;

import com.api.prices.crypto.cryptoprices.entity.ValueAlert;

@Repository
public class PricesRepository {
	
	// The application production, storage this value in a database. This method is only a "mock".
	public void enableDisableAlert(boolean enableDisableAlert) {
		System.out.println("set value true/false in column enableAlert in the table of database");
		System.out.println("insert: "+ new ValueAlert(true, "bitcoin", 16.000).toString());
	}
	
	// The application production, storage this value in a database. This method is only a "mock".
	public ValueAlert getValueAlert() {
		return new ValueAlert(true, "ripple", 0.71);
	}
	
}
