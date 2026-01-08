package Generics.GenericsBounds;
import Generics.GenericsBounds.MyArray;

class MyArray2 extends MyArray<String>{
    public MyArray2(int size){
        super(size);
    }
}


public class GenericDemo2 {
    public static void main(String[] args) {
        MyArray2 ma=new MyArray2(3);
        ma.append("Hello");
        //ma.append(10); //Give Error
    }
}
