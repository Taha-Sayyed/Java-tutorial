package Generics.Wildcard;

class MyArray<T>{
    T data[];
    private int length;
    public MyArray(int size){
        data=(T[])new Object[size];
        length=0;
    }
    public void append(T v){
        data[length]=v;
        length++;
    }
    public void display(){
        for(int i=0;i<length;i++){
            System.out.println(data[i]);
        }
    }
}


public class Demo1 {

    //Argument taking generic parameter
    void func(MyArray<?>obj){
        obj.display();
    }

    public static void main(String[] args) {
        MyArray<String> ma=new MyArray<>(3);
        ma.append("Hi");
        ma.append("Taha");
        Demo1 d=new Demo1();
        d.func(ma);
    }
}
