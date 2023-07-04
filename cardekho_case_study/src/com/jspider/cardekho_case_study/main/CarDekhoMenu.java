package com.jspider.cardekho_case_study.main;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.jspider.cardekho_case_study.operation.CarOperation;

public class CarDekhoMenu {
	static int num;
    public static void main(String[] args) {
       
        demo();
    }

    public static void demo() {
        Scanner sc = new Scanner(System.in);
        CarOperation carOperation = new CarOperation();
        System.out.println("=========*Menu*===========");
        System.out.println("| 1.Add car details      |");
        System.out.println("| 2.Search car details   |");
        System.out.println("| 3.Update car details   |");
        System.out.println("| 4.Delete car details   |");
        System.out.println("| 5.Show all car details |");
        System.out.println("| 6.Exit                 |");
        System.out.println("==========================");
        System.out.print("Enter your input : ");
        try {
            
           num =sc.nextInt();
            
        } catch (InputMismatchException e) {
            System.out.println("Invalid input:  Please enter a valid integer.");
            demo(); 
        }
        
        switch (num) {
            case 1: {
                carOperation.addCar();
                break;
            }
            case 2: {
               carOperation.searchCar();
                break;
            }
            case 3: {
            	carOperation.updateCarDetails();
                break;
            }
            case 4: {
            	carOperation.deleteCar();
                break;
            }
            case 5:{
            	CarOperation.getAllDetails();
            	demo();
            	break;
            }
            case 6: {
                System.out.println("Thank you!!!");
                sc.close();
                break;
            }
            default: {
                System.out.println("Please enter a valid input!!!");
                demo();
                break; // Add the missing break statement here
            }
        }
    }
}
