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
        m.setDaemon(true); //Depend on main thread
        m.start();
        try{Thread.sleep(2000);}catch (Exception e){}
    }
}
