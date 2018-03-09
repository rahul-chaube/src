package fileDemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileInBufferedReader {
    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\Android7\\Desktop\\reverstring in c.txt";
        File file=new File(path);
        BufferedReader br=new BufferedReader(new FileReader(file));
            String str;
        long start=System.currentTimeMillis();
        while ((str=br.readLine())!=null)
        {
            System.out.println(str);
        }
        long end=System.currentTimeMillis();
        long diff=end-start;
        System.out.println("Difference is "+diff);
    }
}
