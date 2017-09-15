package cir;
import java.util.Scanner;

public class circle {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        float r = scan.nextFloat();


        System.out.println("Area of circle is "+ (3.142*r*r));
        System.out.println("Perimeter of circle is "+ (2*3.142*r));
    }
}
