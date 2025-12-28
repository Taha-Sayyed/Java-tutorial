package exceptiondemo;

import java.util.Scanner;

public class ExceptionDemo_2 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first Number");
        a=sc.nextInt();
        System.out.println("Enter second Number");
        b=sc.nextInt();
        try{
            c=a/b;
            System.out.println("Answer is "+c);
        }
        catch(ArithmeticException e){
            System.out.println("Denominator should not be zero ");
        }
        System.out.println("End of the program");
    }
}
