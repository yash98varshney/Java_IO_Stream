package Java_IO_Stream;

import java.io.RandomAccessFile;

public class Randomaccess {
    
    public static void main(String[] args) throws Exception{

        RandomAccessFile rf=new RandomAccessFile("E:/Java_codes/Java_IO_Stream/Randomaccess.txt", "rw");

        System.out.println((char)rf.read());
        System.out.println((char)rf.read());
        System.out.println((char)rf.read());
        rf.write('d');
        System.out.println((char)rf.read());
        rf.skipBytes(3);
        System.out.println((char)rf.read());
        System.out.println(rf.getFilePointer());
        rf.seek(rf.getFilePointer()+2);
        System.out.println((char)rf.read());
    }
}
