package week2;

import java.util.Scanner;

public class Task72 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        if(a>=0 && b>=0){
            System.out.println("Both a and b legal");
        }else {
            if(a>=0 && b<0){
                System.out.println("a is legal b is illegal");
                else{
                    System.out.println("b is legal a is illegal");
                }
            }
            else
            {System.out.println("vice versa");
        }

    }
}
