package challengingQuestions;

class WhiteBoard{
    private String Text;
    static public int studentCount=0;
    private boolean flag=true;

    private void markAttendance(){
        studentCount++;
    }


    synchronized void write(String text){
        while(flag!=true){
            try{wait();}catch(Exception e){
                System.out.println(e);
            }
        }
        Text=text;
        System.out.println("Content written by Teacher");
        flag=false;
        notify();
    }

    synchronized void read(){
        markAttendance();
        String readText;
        while(flag!=false){
            try{wait();}catch(Exception e){
                System.out.println(e);
            }
        }
        readText=Text;
        System.out.println("Count of Student: "+studentCount);
        System.out.println("Content read by Student");
        System.out.println(readText);
        flag=true;
        notify();
    }
}

class Teacher extends Thread{
    WhiteBoard w;
    String content;
    public Teacher(WhiteBoard wb,String teacherContent){
        content=teacherContent;
        w=wb;
    }
    @Override
    public void run(){
        w.write(content);
    }
}

class Student extends Thread{
    WhiteBoard w;
    public Student(WhiteBoard wb){
        w=wb;
    }
    @Override
    public void run(){
        w.read();
    }

}

public class TeacherStudentProblem {
    public static void main(String[] args) {
        WhiteBoard w=new WhiteBoard();
        Teacher t=new Teacher(w,"Java is good language");
        Student s=new Student(w);
        s.start();
        t.start();

    }
}
