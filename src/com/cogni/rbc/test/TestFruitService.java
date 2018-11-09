package com.cogni.rbc.test;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import com.cogni.rbc.service.FruitService;

/**
 * TestFruitService is test class to test FruitService
 * 
 * @author Akash Gaikwad
 *
 */
public class TestFruitService {

	/**
	 * Testcase test the scenario where all fruits in basket (list) are valid
	 * fruits.
	 */
	@Test
	public void testgetTotalCost() {

		FruitService service = new FruitService();
		List<String> basket = new ArrayList<>();
		basket.add("Apples");
		basket.add("LEMONS");
		basket.add("Oranges");
		basket.add("BananaS");
		basket.add("Peaches");
		basket.add("APPLES");

		float expected = 100f;

		assertEquals(expected, service.getTotalCost(basket), 0);
	}

	/**
	 * Testcase test the scenario where basket (list) is null
	 */
	@Test
	public void testgetTotalCostNull() {

		FruitService service = new FruitService();
		List<String> basket = null;
		float expected = 0.0f;

		assertEquals(expected, service.getTotalCost(basket), 0);
	}

	/**
	 * Testcase test the scenario where basket (list) is empty
	 */
	@Test
	public void testgetTotalCostEmpty() {

		FruitService service = new FruitService();
		List<String> basket = new ArrayList<>();
		float expected = 0.0f;

		assertEquals(expected, service.getTotalCost(basket), 0);
	}

	/**
	 * Testcase test the scenario where basket (list) has a invalid fruit.
	 */
	@Test
	public void testgetTotalCostInvalidFruit() {

		FruitService service = new FruitService();
		List<String> basket = new ArrayList<>();
		basket.add("Apples");
		basket.add("LEMONS");
		basket.add("BALL");
		float expected = 25f;
		assertEquals(expected, service.getTotalCost(basket), 0);
	}
}
