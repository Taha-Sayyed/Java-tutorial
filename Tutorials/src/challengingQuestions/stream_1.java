package challengingQuestions;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class Write_Content{
    private String text;
    private String filepath;
    public Write_Content(String filepath){
        this.filepath=filepath;
    }

    public void write(String str){
        try(FileOutputStream fos=new FileOutputStream(filepath)){
            byte b[]=str.getBytes();
            fos.write(b);
            System.out.println("Successfully written in source1.txt");
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    public void shift_text(String filepath1,String filepath2){
        try(FileInputStream fis=new FileInputStream(filepath1);FileOutputStream fos=new FileOutputStream(filepath2)){
            byte b[]=new byte[fis.available()];
            fis.read(b);
            String str=new String(b);
            //System.out.println(str);
            str=str.toUpperCase();
            fos.write(str.getBytes());
            System.out.println("Successfully copied from source1.txt & written in source2.txt");
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}

public class stream_1 {
    public static void main(String[] args) {
        String source1_filepath="C:\\Users\\Admin\\Desktop\\Java-tutorial\\Tutorials\\src\\challengingQuestions\\source1.txt";
        Write_Content wc=new Write_Content(source1_filepath);
        wc.write("JAVA IS GOOD LANGUAGE then Python");
        wc.shift_text("C:\\Users\\Admin\\Desktop\\Java-tutorial\\Tutorials\\src\\challengingQuestions\\source1.txt","C:\\Users\\Admin\\Desktop\\Java-tutorial\\Tutorials\\src\\challengingQuestions\\source2.txt");
    }
}
