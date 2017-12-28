package com.api.prices.crypto.cryptoprices.v1.output.builder;

import com.api.prices.crypto.cryptoprices.v1.output.PricesCryptoOutput;

public class PricesCryptoOutputBuilder {
	
	public String id;
	public String name;
	public String symbol;
	public String rank;
	public String price_usd;
	public String price_btc;
	public String twentyFourHour_volume_usd;
	public String market_cap_usd;
	public String available_supply;
	public String total_supply;
	public String max_supply;
	public String percent_change_1h;
	public String percent_change_24h;
	public String percent_change_7d;
	public String last_updated;
	
	public PricesCryptoOutputBuilder id(String id) {
		this.id = id;
		return this;
	}
	
	public PricesCryptoOutputBuilder name(String name) {
		this.name = name;
		return this;
	}
	
	
	public PricesCryptoOutputBuilder symbol(String symbol) {
		this.symbol = symbol;
		return this;
	}
	
	public PricesCryptoOutputBuilder rank(String rank) {
		this.rank = rank;
		return this;
	}
	
	public PricesCryptoOutputBuilder price_usd(String price_usd) {
		this.price_usd = price_usd;
		return this;
	}
	
	public PricesCryptoOutputBuilder price_btc(String price_btc) {
		this.price_btc = price_btc;
		return this;
	}
	
	public PricesCryptoOutputBuilder twentyFourHour_volume_usd(String twentyFourHour_volume_usd) {
		this.twentyFourHour_volume_usd = twentyFourHour_volume_usd;
		return this;
	}
	
	public PricesCryptoOutputBuilder market_cap_usd(String market_cap_usd) {
		this.market_cap_usd = market_cap_usd;
		return this;
	}
	
	public PricesCryptoOutputBuilder available_supply(String available_supply) {
		this.available_supply = available_supply;
		return this;
	}
	
	public PricesCryptoOutputBuilder total_supply(String total_supply) {
		this.total_supply = total_supply;
		return this;
	}
	
	public PricesCryptoOutputBuilder max_supply(String max_supply) {
		this.max_supply = max_supply;
		return this;
	}
	
	public PricesCryptoOutputBuilder percent_change_1h(String percent_change_1h) {
		this.percent_change_1h = percent_change_1h;
		return this;
	}
	
	public PricesCryptoOutputBuilder percent_change_24h(String percent_change_24h) {
		this.percent_change_24h = percent_change_24h;
		return this;
	}
	
	public PricesCryptoOutputBuilder percent_change_7d(String percent_change_7d) {
		this.percent_change_7d = percent_change_7d;
		return this;
	}
	
	public PricesCryptoOutputBuilder last_updated(String last_updated) {
		this.last_updated = last_updated;
		return this;
	}
	
	public PricesCryptoOutput build() {
		return new PricesCryptoOutput(this);
	}
}
