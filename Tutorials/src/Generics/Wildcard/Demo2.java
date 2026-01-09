package Generics.Wildcard;
import Generics.Wildcard.MyArray;

public class Demo2 {
    void show(MyArray<? extends Number> obj){
        obj.display();
    }

    public static void main(String[] args) {
        Demo2 d=new Demo2();
        MyArray<Integer> ma=new MyArray<>(3);
        ma.append(10);
        ma.append(20);
        d.show(ma);
    }
}
