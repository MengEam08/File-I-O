package FileClasses;

import java.io.File;
import java.nio.file.Files;

public class Main {
    public static void main(String[] args) {
        File file = new File("AboutPaths.txt");
        try {
            if (file.createNewFile()){
                System.out.println("File created");
            }else {
                System.out.printf("File is already created \n");
            }
        }catch (Exception e){

        }
    }
}
