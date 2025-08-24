package lecture02.src.com.musabb;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("eter the character to check if its upper cse or lower case: ");
        char ch = input.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("lower case");
        }else{
            System.out.println("upper case");
        }
    }
}
