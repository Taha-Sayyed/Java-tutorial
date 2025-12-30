package threadtest;

class Myclass implements Runnable{
    @Override
    public void run(){
        int i=1;
        while(true){
            System.out.println(i+" Hello");
        }
    }
}

public class ThreadTest_3 {

    public static void main(String[] args) {
        Myclass m=new Myclass();
        Thread t=new Thread(m);
        t.start();
        int i=1;
        while(true){
            System.out.println(i+" World");
        }

    }
}
