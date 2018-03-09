package fileDemo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) {
        String path="C:\\Users\\Android7\\Desktop\\reverstring in c.txt";
        try {
            FileReader  fileReader=new FileReader(path);
            int i;
            while ((i=fileReader.read())!=-1)
            {
                System.out.println((char)i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
