package serialization.Demo1;


import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

class Student_1{
    public int rollno;
    public String name;
    public String dept;
}

public class read {
    public static void main(String[] args) throws Exception{
        FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\Desktop\\Java-tutorial\\Tutorials\\src\\serialization\\Demo1\\test.txt");
        BufferedReader br=new BufferedReader(new InputStreamReader(fis));
        Student_1 st=new Student_1();
        //st.rollno=Integer.parseInt(br.readLine());
        st.rollno=Integer.parseInt(br.readLine());
        st.name=br.readLine();
        st.dept=br.readLine();
        System.out.println(st.rollno);
        System.out.println(st.name);
        System.out.println(st.dept);
    }
}
