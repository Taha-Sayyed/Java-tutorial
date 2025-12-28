package Inheritance;

class Circle{
    private double radius=10.50;
    public double area(){
        return Math.PI*radius*radius;
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }
    public double circumference(){
        return perimeter();
    }
}

class Cylinder extends Circle{
    private double height;
    public void setHeight(double h){
        height=h;
    }
    public double volume(){
        return area()*height;
    }
}

public class inheritance_demo_1 {
    public static void main(String[] args) {
        Cylinder c=new Cylinder();
        c.setHeight(20.30);
        c.area();
        c.perimeter();
        c.circumference();
        System.out.println(c.volume());
    }
}
