package threadtest;

class My extends Thread{
    @Override
    public void run(){
        int i=1;
        while(true){
            System.out.println(i+" Hello");
        }
    }
}

public class ThreadTest_1 {
    public static void main(String[] args) {
        My m=new My();
        m.start();
        int i=1;
        while(true){
            System.out.println(i+" World");
        }
    }
}
