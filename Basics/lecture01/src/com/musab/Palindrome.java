package com.musab;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word to check if it is palindrome or not");
        String str = sc.next();
        System.out.println(isPalindrome(str));
    }
    private static boolean isPalindrome(String str) {
        String temp ="";
        for(int i=str.length()-1;i>=0;i--){
            temp+=str.charAt(i);

        }
        return  temp.equals(str);
    }
}
