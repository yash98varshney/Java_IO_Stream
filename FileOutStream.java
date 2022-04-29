package Java_IO_Stream;
import java.io.*;
public class FileOutStream {

    public static void main(String[] args){

        try{
            FileOutputStream fos=new FileOutputStream("E:/Java_codes/Java_IO_Stream/Test.txt");
            String str="Hello , This is JAVA test for FileInput Stream";
            
            //Method 1 to write in file 
            fos.write(str.getBytes());
            fos.close();
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
        catch(IOException e){
            System.out.println(e);
        }
        
    }
    
}
