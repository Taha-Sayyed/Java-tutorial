package threadtest;

class ThreadTest_4 implements Runnable{
    @Override
    public void run(){
        int i=1;
        while(true){
            System.out.println(i+" Hello");
        }
    }

    public static void main(String[] args) {
        ThreadTest_4 t=new ThreadTest_4();
        Thread th=new Thread(t);
        th.start();
        int i=1;
        while(true){
            System.out.println(i+" World");
        }
    }
}
