package overriding;

class Super{
    public void display(){
        System.out.println("Hello from Super class");
    }
}

class Sub extends Super{
    @Override
    public void display(){
        System.out.println("Hello from Sub class");
    }
}

public class demo_1 {
    public static void main(String[] args) {
        Super s=new Sub();
        s.display();
    }
}
