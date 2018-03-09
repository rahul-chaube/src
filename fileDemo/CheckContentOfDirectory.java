package fileDemo;

import java.io.File;

public class CheckContentOfDirectory {
    public static void main(String[] args) {
        String dName="C:\\Users\\Android7";
        File file=new File(dName);
        if (file.exists())
        {
            String arr[]= file.list();
            for (int i = 0; i < arr.length; i++) {
               File file1=new File(arr[i]);
               if (file1.isDirectory())
               {
                   System.out.println("this is directory" +arr[i]);
               }
               else
                System.out.println("This is File "+arr[i]);
            }
            System.out.println("No of the directory in "+arr.length);

        }else
            System.out.println("Directory is not found ");

    }
}
