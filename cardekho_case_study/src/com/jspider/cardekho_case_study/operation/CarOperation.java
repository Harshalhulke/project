package com.jspider.cardekho_case_study.operation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.util.Iterator;

import com.jspider.cardekho_case_study.entity.Car;
import com.jspider.cardekho_case_study.main.CarDekhoMenu;

public class CarOperation {
    static List<Car> cars = new ArrayList<Car>();
    static Scanner sc = new Scanner(System.in);

    public static void addCar() {
        System.out.println("How many cars do you want to add: ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            Car car = new Car();
            car.setCar_id(i);
            System.out.println("Enter the car name: ");
            car.setCar_name(sc.next());
            System.out.println("Enter the car price: ");
            car.setCar_price(sc.nextDouble());
            System.out.println("Enter the fuel type: ");
            car.setFuel_type(sc.next());
            System.out.println("Enter the car brand: ");
            car.setCar_brand(sc.next());
            sc.nextLine();
            cars.add(car);
        }

        getAllDetails();
        CarDekhoMenu.demo();
    }

    public static void searchCar() {
       
        boolean b = false;
        System.out.println("=================================");
        System.out.println("1.Search car by name");
        System.out.println("2.Search car by brand");
        System.out.println("3.Search car by fuel type");
        System.out.println("4.Search by price");
        System.out.println("5.Back to main menu");
        System.out.println("\nEnter your input : ");
        int key = sc.nextInt();
        switch (key) {
            case 1: {
            	 getAllDetails();
                System.out.println("Enter the name : ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.println("=============================================================================");
                System.out.println("car id\t\t" + "car name\t" + "car price\t" + "fuel type\t" + "car brand");
                System.out.println("=============================================================================");
                for (Car car : cars) {
                    if (car.getCar_name().equals(name)) {
                    	 
                        System.out.println(car);
                        b = true;
                    }
                }
                if (b == false) {
                    System.out.println("No Car Found");
                }
                searchCar();
                break;
            }
            case 2: {
           	 getAllDetails();
               System.out.println("Enter the car brand : ");
               sc.nextLine();
               String brand = sc.nextLine();
               System.out.println("=============================================================================");
               System.out.println("car id\t\t" + "car name\t" + "car price\t" + "fuel type\t" + "car brand");
               System.out.println("=============================================================================");
               for (Car car : cars) {
                   if (car.getCar_brand().equals(brand)) {
                   	
                       System.out.println(car);
                       b = true;
                   }
               }
               if (b == false) {
                   System.out.println("No Car Found");
               }
               searchCar();
               break;
           }
            case 3: {
              	 getAllDetails();
                  System.out.println("Enter the fuel type : ");
                  sc.nextLine();
                  String fuel_type = sc.nextLine();
                  System.out.println("=============================================================================");
                  System.out.println("car id\t\t" + "car name\t" + "car price\t" + "fuel type\t" + "car brand");
                  System.out.println("=============================================================================");
                  for (Car car : cars) {
                      if (car.getFuel_type().equals(fuel_type)) {
                      	 
                          System.out.println(car);
                          b = true;
                      }
                  }
                  if (b == false) {
                      System.out.println("No Car Found");
                  }
                  searchCar();
                  break;
              }
            case 4: {
              	 getAllDetails();
                  System.out.println("Enter the price : ");
                  sc.nextLine();
                  double price = sc.nextDouble();
                  System.out.println("=============================================================================");
                  System.out.println("car id\t\t" + "car name\t" + "car price\t" + "fuel type\t" + "car brand\t");
                  System.out.println("=============================================================================");
                  for (Car car : cars) {
                      if (car.getCar_price()==price) {
                      	 
                          System.out.println(car);
                          b = true;
                      }
                  }
                  if (b == false) {
                      System.out.println("No Car Found");
                  }
                  searchCar();
                  break;
              }
            case 5:{
            	CarDekhoMenu.demo();
            	break;
            }
            default:
        		System.out.println("Invalid Input. Enter Correct Input.");
        		updateCarDetails();
        	}
            // Add other cases for different search options
        }
    
public static void updateCarDetails() {
	System.out.println("======Update Menu========");
	System.out.println("1.Update Car name");
	System.out.println("2.Update Car fuel type");
	System.out.println("3.Update Car price");
	System.out.println("4.Update Car brand name");
	System.out.println("5.Go back to main menu");
	System.out.println("=========================");
	int key = sc.nextInt();
	getAllDetails();
	System.out.println("\nEnter the car id to update details ");
	int id = sc.nextInt();
	switch (key) {
	case 1:{
		sc.nextLine();
		System.out.println("Enter the name : ");
		String name = sc.nextLine();
		for (Car car : cars) {
			if(car.getCar_id()==id) {
				car.setCar_name(name);
			}
		}
		System.out.println("name is succesfully updated.");
		updateCarDetails();
		break;
	}
	case 2:{
		sc.nextLine();
		System.out.println("Enter the fuel type : ");
		String fuel_type = sc.nextLine();
		for (Car car : cars) {
			if(car.getCar_id()==id) {
				car.setFuel_type(fuel_type);
			}
		}
		System.out.println("fuel type is succesfully updated.");
		updateCarDetails();
		break;
	}
	case 3:{
		sc.nextLine();
		System.out.println("Enter the price : ");
		double price = sc.nextInt();
		for (Car car : cars) {
			if(car.getCar_id()==id) {
				car.setCar_price(price);
			}
		}
		System.out.println("price is succesfully updated.");
		updateCarDetails();
		break;
	}
	case 4:{
		sc.nextLine();
		System.out.println("Enter the brand name : ");
		String brandName = sc.nextLine();
		for (Car car : cars) {
			if(car.getCar_id()==id) {
				car.setCar_brand(brandName);
			}
		}
		System.out.println("brand name is succesfully updated.");
		updateCarDetails();
		break;
	}
	
	case 5:{
		CarDekhoMenu.demo();
		break;
	}

	default:
		System.out.println("Invalid Input. Enter Correct Input.");
		updateCarDetails();
	}
}
public static void deleteCar() {
	getAllDetails();
	System.out.println("\nEnter the car id from above list to remove car :");
	int id = sc.nextInt();
	Iterator<Car> itr = cars.iterator();
	
	while(itr.hasNext()) {
		if(itr.next().getCar_id()==id) {
			itr.remove();
		}
	}
	System.out.println("Car is succesfully removed.");
	CarDekhoMenu.demo();
}
    public static void getAllDetails() {
        System.out.println("=============================================================================");
        System.out.println("car id\t\t" + "car name\t" + "car price\t" + "fuel type\t" + "car brand");
        System.out.println("=============================================================================");

        if (cars.isEmpty()) {
            System.out.println("No cars found!!!");
        } else {
            for (Car car : cars) {
                System.out.println(car);
            }
        }
    }
}
