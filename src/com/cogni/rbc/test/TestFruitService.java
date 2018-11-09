package com.cogni.rbc.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.cogni.rbc.service.FruitService;

/**
 * TestFruitService is test class to test FruitService
 * 
 * @author Akash Gaikwad
 *
 */
public class TestFruitService {

	@Test
	public void testgetTotalCostNormal() {

		FruitService service = new FruitService();
		List<String> basket = new ArrayList<>();
		basket.add("Apples");
		basket.add("LEMONS");
		basket.add("Oranges");
		basket.add("BananaS");
		basket.add("Peaches");
		basket.add("APPLES");

		float expected = 100f;

		assertEquals(expected, service.getTotalCost(basket));
	}

	@Test
	public void testgetTotalCostNull() {

		FruitService service = new FruitService();
		List<String> basket = null;
		float expected = 0.0f;

		assertEquals(expected, service.getTotalCost(basket));
	}

	@Test
	public void testgetTotalCostEmpty() {

		FruitService service = new FruitService();
		List<String> basket = new ArrayList<>();
		float expected = 0.0f;

		assertEquals(expected, service.getTotalCost(basket));
	}

	@Test
	public void testgetTotalCostInvalidFruit() {

		FruitService service = new FruitService();
		List<String> basket = new ArrayList<>();
		basket.add("Apples");
		basket.add("LEMONS");
		basket.add("Orages");
		float expected = 25f;
		assertEquals(expected, service.getTotalCost(basket));
	}
}
