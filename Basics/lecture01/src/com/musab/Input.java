package com.musab;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Roll No: ");
        int rollNo = input.nextInt();
        System.out.println("Roll No: " + rollNo);

        System.out.print("Enter Name: ");
        input.nextLine();  //because to remove the already present \n in the input buffer, we can also use input.next() if we don't want this line
        String name = input.nextLine();
        System.out.println("Name: " + name);

        System.out.print("Enter Marks: ");
        float marks = input.nextFloat();
        System.out.println("Marks: " + marks);
    }
}
