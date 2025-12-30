
package threadtest;

class MyClass_6 extends Thread{
    public void run(){
        int count=1;
        while(true){
            System.out.println(count++);
        }
    }
}

public class ThreadTest_9 {
    public static void main(String[] args) {
        MyClass_5 t=new MyClass_5();
        t.start();
        Thread.yield();
        //yield() will make main method wait for other threads
    }
}

