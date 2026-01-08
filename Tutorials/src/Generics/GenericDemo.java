package Generics;

public class GenericDemo<T> {
    T data[]=(T[])new Object[3]; //Array of Object class and typecast as Generic

    public static void main(String[] args) {
        GenericDemo<String>gd=new GenericDemo<>();
        gd.data[0]=new String("Hello");
        gd.data[1]=new String("Taha");
        gd.data[2]=new String("Sayyed");

        String str=gd.data[0];
        System.out.println(str); //Throwing run time error



    }

}
