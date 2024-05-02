package Serialization;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AboutPaths {
    public static void main(String[] args) {
        Path newFile = Paths.get("AboutPaths.txt");
        try{
           // Files.delete(newFile);
           // Files.createFile(newFile);
           Path path = Paths.get("C:\\Users\\Cs-Store\\Desktop\\JAVA CSTAD\\AboutPaths.txt");
            Files.move(newFile, path);                      // move file (can replace move by copy)
            System.out.printf("File created.");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
