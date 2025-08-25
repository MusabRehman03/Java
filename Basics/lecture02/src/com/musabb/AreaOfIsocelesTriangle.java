package lecture02.src.com.musabb;

import java.util.Scanner;

public class AreaOfIsocelesTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ennter the same sides of the triangle");
        float sides=input.nextInt();
        System.out.println("ennter the base of the triangle");
        float base=input.nextInt();

        double area = (base/4)*(Math.sqrt((4*Math.pow(sides,2))-Math.pow(base,2)));
        System.out.println("area="+area);

    }
}
