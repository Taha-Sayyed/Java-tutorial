package serialization.Demo1;
import java.io.FileOutputStream;
import java.io.PrintStream;

class Student{
    public int rollno;
    public String name;
    public String dept;

}

public class write{
    public static void main(String[] args) throws Exception {
        FileOutputStream fos=new FileOutputStream("C:\\Users\\Admin\\Desktop\\Java-tutorial\\Tutorials\\src\\serialization\\Demo1\\test.txt");
        PrintStream ps=new PrintStream(fos);
        Student st=new Student();
        st.rollno=10;
        st.name="Taha";
        st.dept="AIML";

        ps.println(st.rollno);
        ps.println(st.name);
        ps.println(st.dept);
    }
}