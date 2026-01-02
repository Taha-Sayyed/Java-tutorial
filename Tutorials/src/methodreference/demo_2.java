package methodreference;

interface MyLamda_2{
    void display(String str);
}

public class demo_2 {
    public void reverse(String str){
        StringBuffer s=new StringBuffer(str);
        s.reverse();
        System.out.println(s);
    }

    public static void main(String[] args) {
        demo_2 d=new demo_2();
        MyLambda_2 ml=d::reverse;

        ml.display("Hello");// display() method act as a reverse() method
    }
}
