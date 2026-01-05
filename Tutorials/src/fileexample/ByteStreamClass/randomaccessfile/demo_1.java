package fileexample.ByteStreamClass.randomaccessfile;

import java.io.RandomAccessFile;
import java.security.spec.ECField;

public class demo_1 {
    public static void main(String[] args) throws Exception {
        RandomAccessFile rf=new RandomAccessFile("C:\\Users\\Admin\\Desktop\\Java-tutorial\\Tutorials\\src\\fileexample\\ByteStreamClass\\randomaccessfile\\test","rw");
        System.out.println((char)rf.read());
        System.out.println((char)rf.read());
        System.out.println((char)rf.read());
        System.out.println((char)rf.read());
        rf.write('e');
        System.out.println((char)rf.read());
        rf.seek(1);
        System.out.println((char)rf.read());
        System.out.println((char)rf.read());
        System.out.println((char)rf.read());
        System.out.println((char)rf.read());
        rf.skipBytes(1);
        System.out.println((char)rf.read());

    }
}
