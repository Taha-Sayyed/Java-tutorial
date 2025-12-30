package threadtest;

class MyClass_2 extends Thread{
    public MyClass_2(String name){
        super(name);
        setPriority(Thread.MIN_PRIORITY+3);
        //setName("My thread");
    }
}


public class ThreadTest_5 {
    public static void main(String[] args) {
        MyClass_2 m=new MyClass_2("thread-1");
        System.out.println("ID "+m.getId());
        System.out.println("Thread name: "+m.getName());
        System.out.println("Priority "+m.getPriority());
        System.out.println("State "+m.getState());
        System.out.println("Is alive? "+m.isAlive());
    }
}
