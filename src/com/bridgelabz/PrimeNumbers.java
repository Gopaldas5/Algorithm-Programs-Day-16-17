package com.bridgelabz;

import java.util.Scanner;

public class PrimeNumbers {
    public static int isPrime(int n) {
        // for loop from 2 to n
        for (int i = 2; i < n; i++) {
            // if the number is divisible return -1
            if (n % i == 0) {
                return -1;
            }
        }
        // return 1 if number is prime
        return 1;
    }

    public static void main(String args[]) {
        Scanner numbers = new Scanner(System.in);
        System.out.println("Enter the lower Bound Number :- ");
        int lower_bound = numbers.nextInt();
        System.out.println("Enter the upper Bound Number :- ");
        int upper_bound = numbers.nextInt();

        // int lower_bound = 0, upper_bound = 1000;
        for (int i = lower_bound; i <= upper_bound; i++) {
            // if the number is prime print the number
            if (isPrime(i) == 1) {
                System.out.print(i + " ");
            }
        }
    }

}
