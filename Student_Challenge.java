//Create a file src1 with some data all in Uppercase copy all the connect of this file in second file src2 with all the thing in lowerCase
 
package Java_IO_Stream;

import java.io.*;

public class Student_Challenge {
    
    public static void main(String[] args){

        // creating file src1
        
        try{
            FileOutputStream fos=new FileOutputStream("E:/Java_codes/Java_IO_Stream/src1.txt");
            String str="HELLO THIS IS STUDENT CHALLENGE \nJAVA TEST ";
            fos.write(str.getBytes());
            fos.close();
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
        catch(IOException e){
            System.out.println(e);
        }


        //Copy content of scr1 to scr2 

        try{
            FileInputStream fin=new FileInputStream("E:/Java_codes/Java_IO_Stream/src1.txt");
            FileOutputStream open=new FileOutputStream("E:/Java_codes/Java_IO_Stream/src2.txt");

            byte[] b=new byte[fin.available()];
            fin.read(b);
            String str2=new String(b);
            String tolower=str2.toLowerCase();
            open.write(tolower.getBytes());


            fin.close();
            open.close();
            
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
        catch(IOException e){
            System.out.println(e);
        }



    }
}
