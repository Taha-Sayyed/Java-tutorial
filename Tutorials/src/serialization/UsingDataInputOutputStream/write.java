package serialization.UsingDataInputOutputStream;
import serialization.UsingDataInputOutputStream.student;
import java.io.FileOutputStream;
import java.io.DataOutputStream;


//Files written using DataOutputStream must be read using DataInputStream
public class write {
    public static void main(String[] args)throws Exception {
        FileOutputStream fos=new FileOutputStream("C:\\Users\\Admin\\Desktop\\Java-tutorial\\Tutorials\\src\\serialization\\UsingDataInputOutputStream\\test.txt");
        DataOutputStream dos=new DataOutputStream(fos);
        student s=new student();
        s.rollno=10;
        s.name="Taha";
        s.dept="AIML";
        dos.writeInt(s.rollno);
        dos.writeUTF(s.name);
        dos.writeUTF(s.dept);
    }
}
