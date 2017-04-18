package com.codethen.juices;

import java.util.ArrayList;
import java.util.List;

public class Juice {

	private String name;
	private double price;
	private boolean available;
	private List<String> ingredients = new ArrayList<>();

	
	public void setIngredients(List<String> ingredients) {
		this.ingredients = ingredients;
	}
	
	public List<String> getIngredients() {
		return ingredients;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}
}
