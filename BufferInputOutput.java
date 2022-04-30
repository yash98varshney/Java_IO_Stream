package Java_IO_Stream;

import java.io.*;
public class BufferInputOutput {

    public static void Filereader() throws Exception{
        FileReader fr=new FileReader("E:/Java_codes/Java_IO_Stream/Test.txt");
        BufferedReader br= new BufferedReader(fr);

        System.out.println((char)br.read());
        System.out.println((char)br.read());
        System.out.println((char)br.read());
        br.mark(10);
        System.out.println((char)br.read());
        System.out.println((char)br.read());
        br.reset();
        System.out.println((char)br.read());
        System.out.println((char)br.read());

        // This will read the remaing line jo bcha h 
        System.out.println(br.readLine()); 
        br.close();
    }
    
    public static void main(String[] args) throws Exception{
        FileInputStream fis=new FileInputStream("E:/Java_codes/Java_IO_Stream/Test.txt");
        BufferedInputStream bis=new BufferedInputStream(fis);

        //reading data byte byte 

        int x;
        while((x=bis.read())!=-1){
            System.out.print((char)x);
        }

        //checking marksupported

        System.out.println(fis.markSupported());
        System.out.println(bis.markSupported());

        //Using Mark 

        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        bis.mark(10);
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        bis.reset();
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        bis.close();
        
        Filereader();

    }
}
