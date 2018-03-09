package fileDemo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args)  {
        String str="Hello i am rahul chaube , How are you , wht is is your thought ";
        FileWriter fileWriter= null;
        try {
            fileWriter = new FileWriter("text");
            for (int i = 0; i < str.length(); i++)
                fileWriter.write(str.charAt(i));
            fileWriter.close();
            System.out.println("Wite Writing completed");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Some thing went wrong "+e.getMessage());
        }
        int ch;

        // check if File exists or not
        FileReader fr=null;
        try
        {
            fr = new FileReader("text");
            while ((ch=fr.read())!=-1)
                System.out.print((char)ch);

            // close the file
            fr.close();
        }
        catch (FileNotFoundException fe)
        {
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // read from FileReader till the end of file



    }
}
