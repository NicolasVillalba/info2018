package com.info2018.entrenamiento;

import java.util.Locale;
import java.util.Optional;

public class Converter {
	
	private Converter() {
		
	}
	
	public static Optional<Double> convert(String moneda, Locale locale) {
		if(locale.equals(Locale.US)) {
			return Optional.of(Double.valueOf(moneda) * 2);
		}
		
		return Optional.empty();
	}
	
	public static Double convert2(String moneda, CurrencyType locale) {
		if(Double.valueOf(moneda) < 0) {	
			throw new IllegalArgumentException("Negative numbers are not permited");
		}
		if(locale.equals(CurrencyType.US)) {
			return Double.valueOf(moneda) * 2;
		}
		
		return Double.valueOf(0);
	}
	
	public enum CurrencyType {
		
		US(2.2D);
		
		private final Double equivalenceAmount;
		
		CurrencyType(Double amount) {
			this.equivalenceAmount = amount; 
		}
		
		public Double equivalenceAmount() {
			return this.equivalenceAmount;
		}
		
	}

}
