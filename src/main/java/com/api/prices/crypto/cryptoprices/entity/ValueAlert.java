package com.api.prices.crypto.cryptoprices.entity;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class ValueAlert {
	boolean status;
	String id;
	double price;
}
