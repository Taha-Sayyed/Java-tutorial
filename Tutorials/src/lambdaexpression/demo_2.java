package lambdaexpression;

interface MyLambda_1{
    void display(int a,int b);
}

public class demo_2{
    public static void main(String[] args) {
        MyLambda_1 m=(a,b)->{
            System.out.println(a+b);
        };
        m.display(10,12);
    }
}