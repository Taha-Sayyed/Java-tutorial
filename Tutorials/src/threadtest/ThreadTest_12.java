package threadtest;

class MyData_1{
    private int value=0;
    private boolean flag=true;
    synchronized void set(int v){
        while(flag!=true){
            try{wait();}catch(Exception e){
                System.out.println(e);
            }
        }
        value=v;
        flag=false;
        notify();
    }
    synchronized int get(){
        while(flag!=false){
            try{wait();}catch(Exception e){
                System.out.println(e);
            }
        }
        int x=0;
        x=value;
        flag=true;
        notify();
        return x;
    }
}

class Consumer_1 extends Thread{
    MyData_1 my;
    public Consumer_1(MyData_1 m){
        my=m;
    }
    @Override
    public void run(){
        while(true){
            System.out.println("Consumer "+my.get());
        }
    }
}


class Producer extends Thread{
    MyData_1 my;
    public Producer(MyData_1 m){
        my=m;
    }
    @Override
    public void run(){
        int i=1;
        while(true){
            my.set(i);
            System.out.println("Producer "+i);
            i++;
        }
    }
}



public class ThreadTest_12 {

    public static void main(String[] args) {
        MyData_1 m=new MyData_1();
        Producer p=new Producer(m);
        Consumer_1 c1=new Consumer_1(m);
        p.start();
        c1.start();
    }
}
