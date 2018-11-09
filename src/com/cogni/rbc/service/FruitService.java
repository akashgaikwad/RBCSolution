package com.cogni.rbc.service;

import java.util.List;

import com.cogni.rbc.Fruits;

/**
 * FruitService has method to calculate the total cost of all fruits in list
 * 
 * @author Akash Gaikwad
 *
 */
public class FruitService {

	/**
	 * This method returns the total cost of all the items in list.
	 * <p>
	 * e.g. input = basket has bananas, apples as entries then output = 50.0 as
	 * price of banana and apples are 20 and 30 respectively
	 * <p>
	 * input = basket is empty or null output = 0.0
	 * <p>
	 * input = basket has ball which is not fruit. output = returns the total cost
	 * of other valid item and also log that an invalid item has found
	 * 
	 * @param List of String
	 * @return
	 */
	public float getTotalCost(List<String> basket) {

		float totalCost = 0.0f;

		if (null != basket) {

			for (String fruit : basket) {
				try {
					totalCost += Fruits.valueOf(fruit.toUpperCase()).getPrice();
				} catch (IllegalArgumentException e) {
					System.err.println(e.getMessage() + ": Invalid Fruit in Basket");
				}
			}
		}

		return totalCost;
	}
}
