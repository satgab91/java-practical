package week2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // Write java program, which has byte type variable(Input variables from console)
        //Cast byte to short type, print both variables
        //Cast short to int type, print both variables
        //Cast int to long, print both variables
        //Cast long to float, print both variables
        //Cast float to double type, print both variables
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter byte b");
        byte b=scanner.nextByte();
        System.out.println("Enter short sh");
        short sh=scanner.nextShort();
        System.out.println("Enter int i");
        int i= scanner.nextInt();
        System.out.println("Enter long l");
        long l= scanner.nextLong();
        System.out.println("Enter float f");
        float f= scanner.nextFloat();
        System.out.println("Enter double d");
        double d= scanner.nextDouble();
        sh=b;
        System.out.println(b);
        System.out.println(sh);
        i=sh;
        System.out.println(i);
        System.out.println(sh);
        l=i;
        System.out.println(i);
        System.out.println(l);
        f=l;
        System.out.println(l);
        System.out.println(f);
        d=f;
        System.out.println(f);
        System.out.println(d);


    }
}
