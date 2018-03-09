package fileDemo;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFileScanner {
    public static void main(String[] args) {
        String path="C:\\Users\\Android7\\Desktop\\reverstring in c.txt";
        try {
            long start=System.currentTimeMillis();
            Scanner fileReader=new Scanner(new File(path));
            int i;
            while (fileReader.hasNextLine())
            {
                System.out.println(fileReader.nextLine());
            }
            long end=System.currentTimeMillis();
            long diff=end-start;
            System.out.println("Difference is "+diff);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
