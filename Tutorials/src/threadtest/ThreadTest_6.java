package threadtest;

class MyClass_3 extends Thread{
    public MyClass_3(String name){
        super(name);
    }

    public void run(){
        int count=1;
        while(true){
            System.out.println(count++);
            try{
                Thread.sleep(1000);//checked Exception
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}


public class ThreadTest_6 {
    public static void main(String[] args) {
        MyClass_3 m=new MyClass_3("Thread-1");
        m.start();
        m.interrupt();
    }
}
