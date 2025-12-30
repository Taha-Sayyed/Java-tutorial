package threadtest;

public class ThreadTest_2 extends Thread {
    @Override
    public void run(){
        int i=1;
        while(true){
            System.out.println(i+" Hello");
        }
    }

    public static void main(String[] args) {
        ThreadTest_2 t=new ThreadTest_2();
        t.start();
        int i=1;
        while(true){
            System.out.println(i+" World");
        }
    }
}
