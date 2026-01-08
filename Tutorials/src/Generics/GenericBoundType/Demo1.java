package Generics.GenericBoundType;

class A{}
class B extends  A{}
class C extends  A{}

class MyArray1<T extends A>{

}
public class Demo1 {
    public static void main(String[] args) {
        MyArray1<B>ma=new MyArray1();
        //MyArray1<String>ma=new MyArray1(); //Give Error

    }
}
