package polymorphism;

class Test{
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b, int c){
        return a+b+c;
    }
}

public class overloading_demo_1 {
    public static void main(String[] args) {
        Test t=new Test();
        System.out.println(t.add(10,20));
        System.out.println(t.add(10,20,30));
    }
}
