package constructors;

class Rectangle{
    protected double length;
    protected double breadth;

    public Rectangle(){
        System.out.println("Default constructor called");
        length=breadth=1;
    }
    public Rectangle(double l,double b){
        System.out.println("Parametrised constructor called");
        length=l;
        breadth=b;
    }
}

class Cuboid extends Rectangle{
    private double height;

    public Cuboid(double l,double b,double h){
        super(l,b);
        height=h;
    }
    public double vol(){
        return length*breadth*height;
    }
}

public class demo {
    public static void main(String[] args) {
        Cuboid c=new Cuboid(10.20,20.5,60.3);
        System.out.println(c.vol());
    }
}
