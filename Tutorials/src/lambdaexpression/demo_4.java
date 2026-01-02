package lambdaexpression;

interface MyLambda_3{
    void display();
}

class UseLambda{
    public void callLambda(MyLambda_3 m){ //passing Lambda Expression as parameter
        m.display();
    }
}

class Demo_1{
    public void method1(){
        UseLambda ul=new UseLambda();
        ul.callLambda(()->{
            System.out.println("Hello World");
        });
    }
}

public class demo_4 {
    public static void main(String[] args) {
        Demo_1 d=new Demo_1();
        d.method1();
    }
}
