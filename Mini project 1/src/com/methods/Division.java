package com.methods;

import java.util.Scanner;

public interface Division {
	static void division() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter dividend: ");
        double dividend = scanner.nextDouble();
        System.out.print("Enter divisor: ");
        double divisor = scanner.nextDouble();
        if (divisor == 0) {
            System.out.println("Error: Cannot divide by zero.");
        } else {
            System.out.println("Division is: " + (dividend / divisor));
        }
    }
}
