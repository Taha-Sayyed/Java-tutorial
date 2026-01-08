package Generics;

class MyData<T>{
    private T obj;

    public void setData(T v){
        obj=v;
    }
    public T getData(){
        return obj;
    }
}

public class GenericDemo2 {
    public static void main(String[] args) {
        MyData<String>st=new MyData<>();
        st.setData("Hello");
        System.out.println(st.getData());
    }
}
