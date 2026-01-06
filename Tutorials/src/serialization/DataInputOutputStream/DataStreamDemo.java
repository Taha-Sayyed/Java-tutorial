package serialization.DataInputOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.DataInputStream;

class Student{
    public int rollno;
    public String name;
    public String dept;
    public float avg;
}
public class DataStreamDemo {
    public static void main(String[] args)throws Exception {
        FileOutputStream fos=new FileOutputStream("C:\\Users\\Admin\\Desktop\\Java-tutorial\\Tutorials\\src\\serialization\\DataInputOutputStream\\test.txt");
        DataOutputStream dos=new DataOutputStream(fos);
        Student st=new Student();
        st.rollno=10;
        st.name="Taha";
        st.dept="AIML";
        st.avg=10.20f;

        dos.writeInt(st.rollno);
        dos.writeUTF(st.name);
        dos.writeUTF(st.dept);
        dos.writeFloat(st.avg);

        FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\Desktop\\Java-tutorial\\Tutorials\\src\\serialization\\DataInputOutputStream\\test.txt");
        DataInputStream dis=new DataInputStream(fis);

        Student s=new Student();
        s.rollno=dis.readInt();
        s.name=dis.readUTF();
        s.dept=dis.readUTF();
        s.avg=dis.readFloat();

        System.out.println(s.rollno);
        System.out.println(s.name);
        System.out.println(s.dept);
        System.out.println(s.avg);

    }
}
