package objectclass;
import java.lang.*;


public class demo_1 {
    public static void main(String[] args) {
        Object o1=new Object();
        Object o2=new Object();
        System.out.println(o1);//This eventually call toString()
        System.out.println(o1.toString());
        System.out.println(o1.equals(o2));//Check whether they have referencing to same object
        System.out.println(o1.hashCode());


    }
}
