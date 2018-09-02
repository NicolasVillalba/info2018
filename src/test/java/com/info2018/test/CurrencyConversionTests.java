package com.info2018.test;

import java.util.Currency;
import java.util.Locale;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.info2018.entrenamiento.Converter;

import static org.junit.Assert.*;

public class CurrencyConversionTests {
	
	private String moneda;
	private Currency currency;
	
	@Before
	public void setUp()	{
		this.moneda = "16.65";
		this.currency = Currency.getInstance(Locale.US);
	}
	
	@Test
	public void convertToUSDTest() {
		assertEquals(
				Double.valueOf(33.3),
				Converter.convert(moneda, Locale.US).get()
			);
	}
	
	@Test
	public void conver2tToUSDTest() {
		assertEquals(
				Double.valueOf(33.3), 
				Converter.convert2(moneda, Converter.CurrencyType.US)
			);
	}
	
	@Test
	public void getCurrencyCodeTest() {
		assertEquals("USD", currency.getCurrencyCode());
	}
	
	@Test
	public void currencySymbolTest() {
		assertEquals("USD", currency.getSymbol());
	}
	
	@Test
	public void availablesCurreciesTest() {
		Assert.assertThat(
				Currency.getAvailableCurrencies().toString(),
				CoreMatchers.containsString(" ARS,")
			);
	}
}
