package fileDemo;


import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.IOException;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MoveFile {

    public static void main(String[] args) {
        String original="D:\\love.mp4";
        String destination="D:\\Love"+System.currentTimeMillis()+".mp4";
        try {
            Path temp= Files.copy(Paths.get(original),Paths.get(destination));
            if (temp!=null)
            System.out.println("File renamed and move successfully");
        else
            System.out.println("Failed to move this file ");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error Occured");
        }
    }
}
