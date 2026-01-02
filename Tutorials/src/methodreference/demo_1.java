package methodreference;

interface MyLambda_1{
    public void display(String str);
}

interface MyLambda_2{
    public void display(String str);
}

public class demo_1 {

    public static void reverse(String str){
        StringBuffer sb=new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
    }

    public static void main(String[] args) {
        MyLambda_1 ml=System.out::println;
        ml.display("Hello");

        MyLambda_2 m=demo_1::reverse;
        m.display("Hello");
    }
}
