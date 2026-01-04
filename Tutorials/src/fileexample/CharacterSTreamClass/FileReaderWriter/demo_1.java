package fileexample.CharacterSTreamClass;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class demo_1 {
    public static void main(String[] args) {
        try(FileWriter fwr=new FileWriter("C:\\Users\\Admin\\Desktop\\Java-tutorial\\Tutorials\\src\\fileexample\\ByteStreamClass\\test_1")){
            String str="Java is better then Python";
            fwr.write(str);

        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
