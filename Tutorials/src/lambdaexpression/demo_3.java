package lambdaexpression;

interface MyLambda_2{
    void display();
}

class Demo{
    int counter=0;
    public void meth1(){
        int count=0; //Or make it "final"
        MyLambda_2 m=()->{
            int var_1=20;
            int var_2=++counter;
            System.out.println("Hello World");
            System.out.println("var_1: "+var_1);
            System.out.println("var_2 "+var_2);
            System.out.println(count);
            // count++; //Not allowed
        };
        m.display();
    }
}


public class demo_3 {
    public static void main(String[] args) {
        Demo d=new Demo();
        d.meth1();
    }
}
