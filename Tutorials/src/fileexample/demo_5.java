package fileexample;
import java.io.FileInputStream;
import java.io.IOException;

public class demo_5 {
    public static void main(String[] args) {
        try(FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\Desktop\\Java-tutorial\\Tutorials\\src\\fileexample\\test_1")){
            byte b[]=new byte[fis.available()];
            fis.read(b);
            String str=new String(b);
            System.out.println(str);

        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
