package lambdaexpression;

interface MyLambda{ //Functional Interface
    void display();
}

public class demo_1 {
    public static void main(String[] args) {
        MyLambda m=()->{
            System.out.println("Hello World"); //Definition of display method
        };
        m.display();
    }
}
