package com.cogni.rbc;

/**
 * Enum Fruits has BANANAS, ORANGES, APPLES, LEMONS, PEACHES as its constant
 * with there prices
 * 
 * @author Akash Gaikwad
 *
 */
public enum Fruits {

	BANANAS(30), ORANGES(15), APPLES(20), LEMONS(5), PEACHES(10);

	private float price;

	private Fruits(float price) {
		this.price = price;
	}

	public float getPrice() {

		return price;
	}
}
