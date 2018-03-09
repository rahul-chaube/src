package fileDemo;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFileScannerWithoutLoop {
    public static void main(String[] args) {
        String path="C:\\Users\\Android7\\Desktop\\reverstring in c.txt";
        try {
            long start=System.currentTimeMillis();
            Scanner sc=new Scanner(new File(path));
          sc.useDelimiter("\\Z");
            System.out.println(sc.next());
            long end=System.currentTimeMillis();
            long diff=end-start;
            System.out.println("Difference is "+diff);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
