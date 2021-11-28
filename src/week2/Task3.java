package week2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        double pi=3.14;

        Scanner scanner = new Scanner(System.in);
        double r= scanner.nextDouble();
        double area=pi*r*r;
        double perimeter=2*pi*r;
        System.out.println(area);
        System.out.println(perimeter);

    }


}
