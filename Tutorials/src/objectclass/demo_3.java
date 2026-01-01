package objectclass;

enum Dept{
    CS,IT,CIVIL,ECE;

    private Dept(){
        System.out.println(this.name());
    }

    public void display(){
        System.out.println(this.name()+" "+this.ordinal());
    }
}

public class demo_3 {
    public static void main(String[] args) {
        /*When the enum is loaded, identifiers get created and their constructor is called*/
        Dept d=Dept.CS;
        d.display();
    }
}
