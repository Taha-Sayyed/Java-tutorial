package fileexample.CharacterSTreamClass.FileReaderWriter;
import java.io.FileReader;
public class demo_2 {
    public static void main(String[] args) {
        try(FileReader fr=new FileReader("C:\\Users\\Admin\\Desktop\\Java-tutorial\\Tutorials\\src\\fileexample\\CharacterSTreamClass\\test")){
            int x;
            while((x=fr.read())!=-1){
                System.out.print((char)x);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
