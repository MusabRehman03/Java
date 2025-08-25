package lecture02.src.com.musabb;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the nnumbers you want to find HCF of");
        System.out.println("enter the first number");
        int num1 = input.nextInt();
        System.out.println("enter the second number");
        int num2 = input.nextInt();

        for(int i=Math.min(num1,num2);;i--){
            if(num1%i==0 && num2%i==0){
                System.out.println("HCF is: "+i);
                break;
            }
        }
    }
}
