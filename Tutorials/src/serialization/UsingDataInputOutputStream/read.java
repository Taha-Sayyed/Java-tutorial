package serialization.UsingDataInputOutputStream;
import serialization.UsingDataInputOutputStream.student;
import java.io.FileInputStream;
import java.io.DataInputStream;
public class read {
    public static void main(String[] args) throws Exception{
        FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\Desktop\\Java-tutorial\\Tutorials\\src\\serialization\\UsingDataInputOutputStream\\test.txt");
        DataInputStream dis=new DataInputStream(fis);
        student s=new student();
        s.rollno=dis.readInt();
        s.name=dis.readUTF();
        s.dept=dis.readUTF();
        System.out.println(s.rollno);
        System.out.println(s.name);
        System.out.println(s.dept);
    }
}
