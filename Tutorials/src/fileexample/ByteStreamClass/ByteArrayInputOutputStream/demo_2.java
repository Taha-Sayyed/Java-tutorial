package fileexample.ByteStreamClass.ByteArrayInputOutputStream;

import java.io.ByteArrayInputStream;

public class demo_2 {
    public static void main(String[] args) throws Exception{
        byte b[]={'T','a','h','a'};
        ByteArrayInputStream bis=new ByteArrayInputStream(b);
        String str=new String(bis.readAllBytes());
        System.out.println(str);
        bis.close();
    }
}
