package com.musab;

import java.util.Scanner;

public class FibbonaciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the n for fibonacci series");
        int n = input.nextInt();
//        int last =1, secondLast = 0;
//        int present=0;
//        System.out.print(0+" ");
//        for(int i=0;i<n-1;i++){
//            secondLast = last;
//            last= present;
//            present=last+secondLast;
//
//            System.out.print(present + " ");
//         }
        int last =1, secondLast=0;
        System.out.print(secondLast+" "+last+" ");
        for(int i=2;i<n;i++){
            int temp = secondLast+last;
            System.out.print(temp+" ");
            secondLast = last;
            last = temp;
        }

    }
}
