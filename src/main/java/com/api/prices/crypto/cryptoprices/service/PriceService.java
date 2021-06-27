package com.api.prices.crypto.cryptoprices.service;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.api.prices.crypto.cryptoprices.client.PricesRestClient;
import com.api.prices.crypto.cryptoprices.repository.PricesRepository;
import com.api.prices.crypto.cryptoprices.utils.SendMail;
import com.api.prices.crypto.cryptoprices.v1.output.EnableDisableAlertOutput;
import com.api.prices.crypto.cryptoprices.v1.output.PricesCryptoOutput;

@Service
public class PriceService {
	
	@Autowired
	private PricesRestClient pricesRestClient;
	
	@Autowired
	private PricesRepository pricesRepository;
	
	public ResponseEntity<PricesCryptoOutput[]> getInformation(String id) {
		return pricesRestClient.getCryptoInformation(id);
	}
	
	public String enableDisableAlert(String id, double alertPrice, boolean enableDisable) {
		pricesRepository.enableDisableAlert(enableDisable);
		if(enableDisable)
			initMonitoringOfPrice(alertPrice, id);
		return new EnableDisableAlertOutput(enableDisable, new Date()).toString();
	}

	public String initMonitoringOfPrice(double alertPrice, String id) {
		System.out.println("===> Monitoring price <===");
		List<PricesCryptoOutput> info = Arrays.asList(pricesRestClient.getCryptoInformation(id).getBody());

		info.stream()
				.map(PricesCryptoOutput::getPrice_usd)
				.map(Double::parseDouble)
				.filter(item -> item > alertPrice)
				.forEach(item -> alertUser(item, id));

		return info.toString();
	}

	private void alertUser(double alertPrice, String id) {
		System.out.println("New price of "+id+" is "+alertPrice);
		SendMail.sendMail(alertPrice);
	}
}
