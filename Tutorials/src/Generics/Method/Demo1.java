package Generics.Method;


public class Demo1 {
    public static <E> void show(E[] list){
        for(E x:list){
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        Integer arr[]={10,20,30,40,50,60};
        show(arr);
    }
}
