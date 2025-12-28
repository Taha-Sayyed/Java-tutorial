package resourcesdemo;

import java.io.FileInputStream;
import java.util.Scanner;

public class TryWithResource {

    static void Divide() throws Exception{
        try(FileInputStream fi=new FileInputStream("C:\\Users\\Admin\\Desktop\\JAVA\\Tutorials\\src\\resourcesdemo\\Test.txt");Scanner sc=new Scanner(fi))
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            System.out.println(a/c);
        }
    }

    public static void main(String[] args) {
        try{
            Divide();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
