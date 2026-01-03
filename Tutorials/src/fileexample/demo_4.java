package fileexample;
import java.io.FileOutputStream;
import java.io.IOException;

public class demo_4 {
    public static void main(String[] args){
        try(FileOutputStream fos=new FileOutputStream("C:\\Users\\Admin\\Desktop\\Java-tutorial\\Tutorials\\src\\fileexample\\test_1")){
            String str="Java is good language to study";
            fos.write(str.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
