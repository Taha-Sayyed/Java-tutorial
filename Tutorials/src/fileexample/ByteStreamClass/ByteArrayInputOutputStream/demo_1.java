package fileexample.ByteStreamClass.ByteArrayInputOutputStream;

import java.io.ByteArrayInputStream;

public class demo_1{
    public static void main(String[] args) throws Exception{
        byte b[]={'a','b','c'};
        ByteArrayInputStream bis=new ByteArrayInputStream(b);
        int x;
        while((x=bis.read())!=-1){
            System.out.print((char)x);
        }
        bis.close();
    }
}
