package com.main;
import java.util.Scanner;

import com.methods.Addition;
import com.methods.Average;
import com.methods.Cube;
import com.methods.Division;
import com.methods.EvenOrOdd;
import com.methods.Factors;
import com.methods.Modulus;
import com.methods.Multiplication;
import com.methods.Square;
import com.methods.Subtraction;

public class MathOperations {
	
	public static void getOperations() {
		Scanner scanner = new Scanner(System.in);
		while(true) {
        	System.out.print("Enter your choice code: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                	Addition.addition();
                    break;
                case 2:
                    Subtraction.subtraction();
                    break;
                case 3:
                    Multiplication.multiplication();
                    break;
                case 4:
                    Division.division();
                    break;
                case 5:
                    Modulus.modulus();
                    break;
                case 6:
                    Square.square();
                    break;
                case 7:
                    Cube.cube();
                    break;
                case 8:
                    Average.average();
                    break;
                case 9:
                    Factors.factors();
                    break;
                case 10:
                    EvenOrOdd.evenOrOdd();
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid operation.");
            }
        }
	}
	
    public static void main(String[] args) {
        
        System.out.println("Welcome to console based application for mathematical operations");

        System.out.println("\nSelect operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        System.out.println("6. Square");
        System.out.println("7. Cube");
        System.out.println("8. Average");
        System.out.println("9. Factors");
        System.out.println("10. Check even or odd");
        System.out.println("11. Exit");
       
        System.out.println("\n");
        
        getOperations();
        
    }

}
