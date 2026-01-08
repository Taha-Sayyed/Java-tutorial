package Generics;

public class Demo1 {
    public static void main(String[] args) {
        Object obj=new String("Hello Taha");
        //obj=new Integer(10); //Throw Runtime Exception Error
        String str=(String) obj;
        System.out.println(str);
    }
}
