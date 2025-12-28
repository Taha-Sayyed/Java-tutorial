package exceptiondemo;

public class ExceptionDemo_1 {
    public static void main(String[] args) {

        try{
            int a,b,c;
            a=5;
            b=0;
            c=a/b; //Give error on runtime
            System.out.println(c); //Give error on runtime
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("End of the program");
        System.out.println("Bye");
    }
}
