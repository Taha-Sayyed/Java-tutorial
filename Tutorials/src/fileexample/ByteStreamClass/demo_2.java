package fileexample.ByteStreamClass;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class demo_2 {
    public static void main(String[] args) {
        try{
            FileOutputStream fos=new FileOutputStream("C:\\Users\\Admin\\Desktop\\Java-tutorial\\Tutorials\\src\\fileexample\\test_1");
            String str="Java is Programming language";
            byte b[]= str.getBytes();
            for(byte x:b){
                fos.write(x);
            }
            fos.close();
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
