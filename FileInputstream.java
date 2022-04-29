package Java_IO_Stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputstream {
    
    public static void main(String[] args){

        //Method 1 
        try{
            FileInputStream fis=new FileInputStream("E:/Java_codes/Java_IO_Stream/Test.txt");

            //fis.available() gives the length of file .
            byte[] b=new byte[fis.available()];

            fis.read(b);

            String str=new String(b);

            System.out.println(str);
            fis.close();
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
        catch(IOException e){
            System.out.println(e);
        }


        //Method 2 reading byte by byte 

        try{
            FileInputStream fis=new FileInputStream("E:/Java_codes/Java_IO_Stream/Test2.txt");

            int x;

            while((x=fis.read()) !=-1){
                System.out.print((char)x);
            }

            fis.close();
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
        catch(IOException e){
            System.out.println(e);
        }

    }
}
