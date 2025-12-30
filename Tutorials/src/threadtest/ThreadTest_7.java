package threadtest;

class MyClass_4 extends Thread{
    @Override
    public void run(){
        int count=1;
        while(true){
            System.out.println(count++);
        }
    }
}

public class ThreadTest_7 {
    public static void main(String[] args) {
        MyClass_4 m=new MyClass_4();
        m.setDaemon(true); //Daemon threads run in the background
        m.start();
        try{Thread.sleep(2000);}catch (Exception e){}
    }
}

//The JVM does not wait for daemon threads to finish
//When all non-daemon threads finish, the JVM exits
//When the JVM exits, all daemon threads are stopped immediately