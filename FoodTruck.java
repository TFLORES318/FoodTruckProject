package com.skilldistillery.foodtruck;

public class FoodTruck {

	private String foodTruckName;
	private String foodTruckCuisine;
	private int foodTruckRating;
	private static int foodTruckId = 0;
	private int uniqueFoodTruckId;

	public FoodTruck(String fTruckName, String fTruckCuisine, int fTruckRating) {
		this.foodTruckName = fTruckName;
		this.foodTruckCuisine = fTruckCuisine;
		this.foodTruckRating = fTruckRating;
		FoodTruck.foodTruckId++;
		this.uniqueFoodTruckId = foodTruckId;

	}

	public FoodTruck() {
		foodTruckId = uniqueFoodTruckId++;
	}

	public String getFoodTruckName() {
		return foodTruckName;
	}

	public void setFoodTruckName(String fTruckName) {
		this.foodTruckName = fTruckName;
	}

	public String getFoodTruckCuisine() {
		return foodTruckCuisine;
	}

	public void setFoodTruckCuisine(String fTruckCuisine) {
		this.foodTruckCuisine = fTruckCuisine;
	}

	public int getFoodTruckRating() {
		return foodTruckRating;
	}

	public void setFoodTruckRating(int fTruckRating) {
		this.foodTruckRating = fTruckRating;
	}

	public int getFoodTruckId() {
		return foodTruckId;
	}

	public void setFoodTruckId(int fTruckId) {
		FoodTruck.foodTruckId = fTruckId;
	}

	public int getUniqueFoodTruckId() {
		return uniqueFoodTruckId;
	}

	public void setUniqueFoodTruckId() {
	}

	@Override
	public String toString() {
		return "FoodTruck [foodTruckName=" + foodTruckName + ", foodTruckCuisine=" + foodTruckCuisine
				+ ", foodTruckRating=" + foodTruckRating + ", uniqueFoodTruckId=" + uniqueFoodTruckId + "]";
	}
}
