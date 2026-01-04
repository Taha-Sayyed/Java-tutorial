package fileexample.ByteStreamClass.ByteArrayInputOutputStream;
import java.io.CharArrayReader;

public class demo_5 {
    public static void main(String[] args)throws Exception {
        int x;
        char c[]={'T','a','h','a'};
        CharArrayReader cr=new CharArrayReader(c);
        while((x=cr.read())!=-1){
            System.out.println((char)x);
        }
        System.out.println(cr.read());
    }
}
