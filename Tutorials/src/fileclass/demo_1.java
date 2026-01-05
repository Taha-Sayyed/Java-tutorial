package fileclass;
import java.io.File;
public class demo_1 {
    public static void main(String[] args) {
        File fs=new File("C:\\Users\\Admin\\Desktop\\Java-tutorial\\Tutorials\\src\\polymorphism");
        String str[]=fs.list();
        for(String x:str){
            System.out.println(x);
        }
        System.out.println(fs.isDirectory());
        System.out.println(fs.isFile());
        File file[]=fs.listFiles();
        for(File x:file){
            System.out.println(x);
        }
    }
}
