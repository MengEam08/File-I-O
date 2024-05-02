package File;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
//    public void createFile(){
//        Path newFile = Paths.get("Person.csv");
//        try{
//            Files.createFile(newFile);
//            System.out.printf("File created.");
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//    }
    public void writeDataToFile(){
        Path filePath = Paths.get("Person.csv");
        try (BufferedOutputStream write = new BufferedOutputStream(new FileOutputStream(filePath.toFile(),true))){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Information");
            System.out.printf("Enter ID: ");
            int id = scanner.nextInt();
            System.out.printf("Enter Name: ");
            String name = scanner.next();
            System.out.printf("Enter Gender: ");
            String gender = scanner.next();
            System.out.printf("Enter Age: ");
            int age = scanner.nextInt();
            Person person = new Person(id, name, gender, age);

//            String personData = person.getId() + "," + person.getName() + "," + person.getGender() + "," + person.getAge() + "\n";
//            write.write(personData.getBytes());
            System.out.printf("Data written to file.");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
    Main write = new Main();
    //write.createFile();
    write.writeDataToFile();
    }
}
