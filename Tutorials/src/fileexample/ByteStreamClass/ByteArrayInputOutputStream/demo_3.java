package fileexample.ByteStreamClass.ByteArrayInputOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class demo_3 {
    public static void main(String[] args) {
        ByteArrayOutputStream bos=new ByteArrayOutputStream(20);
        bos.write('T');
        bos.write('a');
        bos.write('h');
        bos.write('a');

        byte b[]=bos.toByteArray();
        for(byte x:b){
            System.out.println(x);
        }
    }
}
