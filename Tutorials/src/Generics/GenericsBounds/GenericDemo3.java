package Generics.GenericsBounds;
import Generics.GenericsBounds.MyArray;

class MyArray3<T> extends MyArray<T>{
    public MyArray3(int size){
        super(size);
    }
}

public class GenericDemo3 {
    public static void main(String[] args) {
        MyArray3<Integer> ma=new MyArray3<>(3);
        ma.append(10);
        ma.append(20);
        //ma.append("Hello"); //Not allowed since generic parameter is "Integer"
    }
}
