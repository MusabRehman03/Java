package com.musab;

public class DataTypes {
    public static void main(String[] args) {
        int rollNo = 64;
        char gender = 'M';
        float balance = 100.05f; //why f at end? because by default all decimal are of type double so we have to place f at the end
        double largeDecimalNumber= 23456.54332;
        long largeInteger = 1234567890789L; // same as float and double, by default its int
        boolean check = true;

        //we can use classes of primitive types as well
        Integer rNo = 10004563;
        String temp = rNo.toString();

    }
}
