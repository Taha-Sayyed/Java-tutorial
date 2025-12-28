package resourcesdemo;
import java.io.*;
import java.util.*;

public class TryWithoutResource {

    static FileInputStream f;
    static Scanner sc;

    static void Divide() throws FileNotFoundException{

        try{
            f=new FileInputStream("C:\\Users\\Admin\\Desktop\\Java-tutorial\\Tutorials\\src\\resourcesdemo\\Test.txt");
            sc=new Scanner(f);
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println(a/b);
        }
        finally {
            try{
                f.close(); //Checked Exception: Must be handled
                sc.close();
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        try{
            Divide();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
