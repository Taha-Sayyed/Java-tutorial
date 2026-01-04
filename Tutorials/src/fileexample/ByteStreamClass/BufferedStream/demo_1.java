package fileexample.ByteStreamClass.BufferedStream;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.BufferedInputStream;

public class demo_1 {
    public static void main(String[] args) throws Exception{
        FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\Desktop\\Java-tutorial\\Tutorials\\src\\fileexample\\ByteStreamClass\\BufferedStream\\test");
        BufferedInputStream bis=new BufferedInputStream(fis);
        int x;
        while((x=bis.read())!=-1){
            System.out.print((char)x);
        }
    }
}
