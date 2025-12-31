package threadtest;

class MyData{
    void display(String str){ //shared data/resource
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i));
        }
    }
}

class MyThread_1 extends Thread{
    MyData ref_1;
    MyThread_1(MyData dat){
        ref_1=dat;
    }
    @Override
    public void run(){
        ref_1.display("Hello World");
    }
}


class MyThread_2 extends Thread{
    MyData ref_2;
    MyThread_2(MyData d){
        ref_2=d;
    }

    @Override
    public void run(){
        ref_2.display("Taha Sayyed");
    }
}



public class ThreadTest_10 {
    public static void main(String[] args) {
        MyData my=new MyData();
        MyThread_1 t1=new MyThread_1(my);
        MyThread_2 t2=new MyThread_2(my);
        t1.start();
        t2.start();
    }
}
