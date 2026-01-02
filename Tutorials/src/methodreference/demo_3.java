package methodreference;

interface MyLambda_3{
    void display(String str);
}

public class demo_3 {
    public demo_3(String str){
        System.out.println(str);
    }

    public static void main(String[] args) {
        MyLambda_3 ml=demo_3::new;
        ml.display("hello"); //Here display method call the constructor and pass the argument
    }
}
