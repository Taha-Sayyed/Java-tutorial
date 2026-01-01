package objectclass;

public class demo_2 {
    public static void main(String[] args) {
        String s1=new String("Hello");
        String s2=s1.concat("Taha");
        StringBuffer s3=new StringBuffer("Hello Taha");
        s3.append("Sayyed");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
