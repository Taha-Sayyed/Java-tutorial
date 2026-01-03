package fileexample.ByteStreamClass;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class demo_1 {
    public static void main(String[] args) {
        try{
            FileOutputStream fos=new FileOutputStream("C:\\Users\\Admin\\Desktop\\Java-tutorial\\Tutorials\\src\\fileexample\\test_1");
            String str="Java is good language";
            fos.write(str.getBytes(StandardCharsets.UTF_8));
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
