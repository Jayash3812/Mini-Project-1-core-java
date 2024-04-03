package com.methods;

import java.util.Scanner;

public interface Average {
	static void average() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter count of numbers: ");
        int count = scanner.nextInt();
        double sum = 0;
        for (int i = 0; i < count; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            sum += scanner.nextDouble();
        }
        System.out.println("Average is: " + (sum / count));
    }
}
