package fileexample;
import java.io.FileInputStream;
import java.io.IOException;

public class demo_6 {
    public static void main(String[] args) {
        try(FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\Desktop\\Java-tutorial\\Tutorials\\src\\fileexample\\test_1")){
            int x=fis.read(); //read only one byte
            while(x!=-1){
                System.out.print((char)x);
                x=fis.read();
            }
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
