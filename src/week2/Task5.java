package week2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        boolean t=true;
        boolean f=false;
        int myage= scanner.nextInt();
        if(myage>=18){
            System.out.println(t);
        }else
        {
            System.out.println(f);
        }
    }
}
