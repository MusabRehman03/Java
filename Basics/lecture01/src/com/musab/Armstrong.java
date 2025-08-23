package com.musab;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find if it is armstrong or not");
        int n = sc.nextInt();
        System.out.println(isArmstrong(n));

    }
    private static boolean isArmstrong(int n) {
        int actual = n;
        int temp = n;
        int size=0;
        while(temp!=0){
            temp=temp/10;
            size++;
        }
        double armstrong=0;
        while(n!=0){
            int rem=n%10;
            armstrong +=Math.pow(rem,size);
            n=n/10;
        }

        return armstrong == actual ;
    }
}
