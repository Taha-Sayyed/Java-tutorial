package serialization.UsingObjectInputOutputStream;
import java.io.*;

class Student implements Serializable{

    public int rollno;
    public String name;
    public String dept;

    public Student(){}
    public Student(int rollno,String name,String dept){
        this.rollno=rollno;
        this.name=name;
        this.dept=dept;
    }
}

class Write{
    Student st;
    public Write(Student s){
        st=s;
    }

    public void write() throws Exception{
        FileOutputStream fos=new FileOutputStream("C:\\Users\\Admin\\Desktop\\Java-tutorial\\Tutorials\\src\\serialization\\UsingObjectInputOutputStream\\test.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(st);
        oos.close();
        fos.close();
    }
}

class Read{
    Student st;

    public Read(Student s){
        st=s;
    }

    public void read()throws Exception{
        FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\Desktop\\Java-tutorial\\Tutorials\\src\\serialization\\UsingObjectInputOutputStream\\test.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        st=(Student)ois.readObject();
        System.out.println(st.rollno);
        System.out.println(st.name);
        System.out.println(st.dept);
    }
}

public class SerializationDemo {
    public static void main(String[] args)throws Exception {
        Student s=new Student(10,"Taha","AIML");
        Write w=new Write(s);
        Read r= new Read(s);
        w.write();
        r.read();
    }
}
