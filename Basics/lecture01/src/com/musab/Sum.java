package com.musab;

import  java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter the 2nd number: ");
        int secondNumber = input.nextInt();
        int sum = firstNumber + secondNumber;
        System.out.println("sum is: "+ sum);
    }
}
