package Generics;

public class Demo2 {
    public static void main(String[] args) {
        Object data[]=new Object[3];
        data[0]=new String("Hello");
        data[1]=new String("Taha");
        data[2]=new Integer(10);

        for(int i=0;i<3;i++){
            String str=(String)data[i];
            System.out.println(str);
        }
    }
}
