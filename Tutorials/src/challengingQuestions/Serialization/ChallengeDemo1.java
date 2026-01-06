package challengingQuestions.Serialization;
import javax.xml.crypto.Data;
import java.io.FileInputStream;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.DataOutputStream;

public class ChallengeDemo1 {
    public static void main(String[] args)throws Exception {
        FileOutputStream fos=new FileOutputStream("C:\\Users\\Admin\\Desktop\\Java-tutorial\\Tutorials\\src\\challengingQuestions\\Serialization\\test.txt");
        DataOutputStream dos=new DataOutputStream(fos);
        dos.writeInt(4);
        dos.writeFloat(10.5f);
        dos.writeFloat(2.9f);
        dos.writeFloat(3.7f);
        dos.writeFloat(5.2f);

        dos.close();
        fos.close();

        FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\Desktop\\Java-tutorial\\Tutorials\\src\\challengingQuestions\\Serialization\\test.txt");
        DataInputStream dis=new DataInputStream(fis);

        int count=dis.readInt();
        while(count!=0){
            System.out.println(dis.readFloat());
            count--;
        }
        fis.close();
        dis.close();

    }
}
