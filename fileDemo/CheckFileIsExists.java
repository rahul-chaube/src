package fileDemo;

import java.io.File;

public class CheckFileIsExists {
    public static void main(String[] args) {
        String FilePath="C:\\Users\\Android7\\Downloads\\ic_add_black_24dp.zip";
        File file=new File(FilePath);
        System.out.println("File name is "+file.getName());
        System.out.println("Path "+file.getPath());
        System.out.println("Absolute path "+file.getAbsolutePath());
        System.out.println("Parent "+file.getParent());
        System.out.println("File exists "+file.exists());
        if (file.exists())
        {
            System.out.println("File is writable "+file.canWrite());
            System.out.println("File is Read "+file.canRead());
            System.out.println("File is Execute "+file.canExecute());
            System.out.println("File Size in Byte "+ file.length());

        }
    }
}
