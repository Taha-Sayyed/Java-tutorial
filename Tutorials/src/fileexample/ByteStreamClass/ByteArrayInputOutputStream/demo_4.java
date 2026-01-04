package fileexample.ByteStreamClass.ByteArrayInputOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class demo_4 {
    public static void main(String[] args)throws Exception {
        ByteArrayOutputStream bos=new ByteArrayOutputStream(20);
        bos.write('T');
        bos.write('a');
        bos.write('h');
        bos.write('a');
        bos.writeTo(new FileOutputStream("C:\\Users\\Admin\\Desktop\\Java-tutorial\\Tutorials\\src\\fileexample\\ByteStreamClass\\ByteArrayInputOutputStream\\test.txt"));
        bos.close();
    }
}
