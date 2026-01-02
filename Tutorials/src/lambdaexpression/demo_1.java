package lambdaexpression;

interface MyLambda{
    void display();
}

public class demo_1 {
    public static void main(String[] args) {
        MyLambda m=()->{
            System.out.println("Hello World");
        };
        m.display();
    }
}
