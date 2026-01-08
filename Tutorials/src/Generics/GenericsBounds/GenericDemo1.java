package Generics.GenericsBounds;

class MyArray1<T>{
    T data[];
    private int length;
    public MyArray1(int size){
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



public class GenericDemo1 {

    public static void main(String[] args) {
        MyArray1 ma=new MyArray1(3);
        ma.append("Hello");
        ma.append(new Integer(10));
        ma.display();
    }

}