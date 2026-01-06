package serialization.PrintStream;
import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class read {
    public static void main(String[] args)throws Exception {
        FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\Desktop\\Java-tutorial\\Tutorials\\src\\serialization\\PrintStream\\test.txt");
        BufferedReader br=new BufferedReader(new InputStreamReader(fis));
        int rollno=Integer.parseInt(br.readLine());
        String name=br.readLine();
        String dept=br.readLine();
        System.out.println(name);
        System.out.println(rollno);
        System.out.println(dept);

    }
}
