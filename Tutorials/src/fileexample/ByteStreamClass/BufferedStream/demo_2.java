package fileexample.ByteStreamClass.BufferedStream;
import java.io.FileInputStream;
import java.io.BufferedInputStream;


public class demo_2 {
    public static void main(String[] args) throws Exception{
        FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\Desktop\\Java-tutorial\\Tutorials\\src\\fileexample\\ByteStreamClass\\BufferedStream\\test");
        BufferedInputStream bis=new BufferedInputStream(fis);
        System.out.print((char) bis.read());
        System.out.print((char) bis.read());
        bis.mark(2); //Upto 2 letter the mark is valid
        System.out.print((char) bis.read());
        System.out.print((char) bis.read());
        bis.reset();
        System.out.print((char) bis.read());
        System.out.print((char) bis.read());
        System.out.print((char) bis.read());
        System.out.print((char) bis.read());
        System.out.print((char) bis.read());
        System.out.print((char) bis.read());
        System.out.print((char) bis.read());
        System.out.print((char) bis.read());



    }
}
