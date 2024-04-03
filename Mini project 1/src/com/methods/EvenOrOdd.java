package com.methods;

import java.util.Scanner;

public interface EvenOrOdd {
	static void evenOrOdd() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
    }
}
