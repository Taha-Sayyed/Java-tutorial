package serialization.PrintStream;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class write {
    public static void main(String[] args)throws Exception {
        FileOutputStream fos=new FileOutputStream("C:\\Users\\Admin\\Desktop\\Java-tutorial\\Tutorials\\src\\serialization\\PrintStream\\test.txt");
        PrintStream ps=new PrintStream(fos);
        ps.println(10);
        ps.println("Taha");
        ps.println("AIML");
        System.out.println("Succesffuly write");
    }
}
