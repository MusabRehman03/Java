package lecture02.src.com.musabb;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the nnumbers you want to find LCM of");
        System.out.println("enter the first number");
        int num1 = input.nextInt();
        System.out.println("enter the second number");
        int num2 = input.nextInt();

        for(int i = Math.max(num1,num2);; i++){
            if(i%num1==0&&i%num2==0){
                System.out.println("the LCM is: "+ i);
                break;
            }
        }

    }
}
