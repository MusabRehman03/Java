package Functions;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to find out if its prime or not");
        int x = sc.nextInt();
        System.out.println(Prime(x));
    }
    public static boolean Prime(int a)
    {
        if(a<=1){
            return false;
        }
        int b=2;
        while(b<=Math.sqrt(a)){
            if(a%b==0){
                return false;
            }
            b++;
        }
        return true;
    }
}
