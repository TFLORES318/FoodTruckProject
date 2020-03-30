package com.skilldistillery.foodtruck;

import java.util.Scanner;

public class FoodTruckApplication {
	Scanner kb = new Scanner(System.in);
	static FoodTruckApplication foodTruck = new FoodTruckApplication();
	static FoodTruck foodTrucks[] = new FoodTruck[5];

	public static void main(String[] args) {
		foodTruck.foodTruckFinder();
		foodTruck.foodTruckMenu();
	}

	public FoodTruck[] foodTruckFinder() {
		System.out.println("Welcome to the ~*~Food Truck App~*~!");
		String foodTruckName = null;
		String foodTruckCuisine = null;
		int foodTruckRating = 0;

		for (int i = 0; i < foodTrucks.length; i++) {
			System.out.println("Enter in the name of the food truck: ");
			foodTruckName = kb.nextLine();
			if (foodTruckName.equals("quit")) {
				break;
			}
			System.out.println("Enter in this food truck's cuisine: ");
			foodTruckCuisine = kb.nextLine();
			System.out.println("Enter in this food truck's rating, 1 being the worst, 5 being the best: ");
			foodTruckRating = kb.nextInt();
			kb.nextLine();
			foodTrucks[i] = new FoodTruck(foodTruckName, foodTruckCuisine, foodTruckRating);
		}
		return foodTrucks;
	}

	public void foodTruckMenu() {
		System.out.println("Please choose from the following options: ");
		System.out.println("1. List all existing food trucks: ");
		System.out.println("2. See the average rating of the food trucks: ");
		System.out.println("3. Display the highest-rated food truck: ");
		System.out.println("4. Quit");
		int option = kb.nextInt();
		while (option != 4) {
			if (option == 1) {
				foodTruck.displayFoodTrucks();
			} else if (option == 2) {
				displayAverageRating();
			} else if (option == 3) {
				displayHighestRatedFoodTruck();
			}
			System.out.println("Please select another option: ");
			foodTruckMenu();
			option = kb.nextInt();
		}
		quitProgram();
	}

	public void displayFoodTrucks() {
		for (int i = 0; i < foodTrucks.length; i++) {
			if (foodTrucks[i] != null) {
				System.out.println(foodTrucks[i].toString());
			}
		}
	}

	public void displayAverageRating() {
		double totalFoodTruckRatings = 0.0;
		int indexSpot = 0;
		for (indexSpot = 0; indexSpot < foodTrucks.length; indexSpot++) {
			if (foodTrucks[indexSpot] == null) {
				break;
			} else {
				int foodTruckRating = foodTrucks[indexSpot].getFoodTruckRating();
				totalFoodTruckRatings = totalFoodTruckRatings + foodTruckRating;
			}
		}
		double average = (double) totalFoodTruckRatings / indexSpot;
		System.out.println(average);
	}

	public void displayHighestRatedFoodTruck() {
		FoodTruck bestRated = foodTrucks[0];
		int indexSpot = 0;
		for (indexSpot = 0; indexSpot < foodTrucks.length; indexSpot++) {
			if (foodTrucks[indexSpot] == null) {
				break;
			} else if (bestRated.getFoodTruckRating() < foodTrucks[indexSpot].getFoodTruckRating()) {
				bestRated = foodTrucks[indexSpot];
			}
		}
		System.out.println("The most popular truck is " + bestRated.getFoodTruckName() + ". It has a "
				+ bestRated.getFoodTruckRating() + " star rating. This truck's cuisine is "
				+ bestRated.getFoodTruckCuisine());
	}

	public void quitProgram() {
		System.out.println("Thanks for using the Food Truck App!");
		System.exit(0);
	}
}
