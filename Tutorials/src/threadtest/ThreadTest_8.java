package threadtest;

class MyClass_5 extends Thread{
    public void run(){
        int count=1;
        while(true){
            System.out.println(count++);
        }
    }
}

public class ThreadTest_8 {
    public static void main(String[] args) {
        MyClass_5 t=new MyClass_5();
        t.setDaemon(true);
        t.start();
        Thread MainThread=Thread.currentThread();
        try{MainThread.join();}catch(Exception e){
            System.out.println(e);
        }
    }
}
