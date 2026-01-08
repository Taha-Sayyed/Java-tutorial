package Generics;

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

public class GenericDemo3 {
    public static void main(String[] args) {
        MyArray<String>obj=new MyArray<>(3);
        obj.append("Hello");
        obj.append("Taha");
        obj.append("sayyed");
        obj.display();
    }

}
