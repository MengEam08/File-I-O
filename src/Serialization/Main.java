//package Serialization;
//
//import java.io.*;
//
//class AboutSerialization {
//    public static void writeObjectToString( StudentS studentS){
//        try {
//            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("student.dat"));
//            objectOutputStream.writeObject(studentS);
//            objectOutputStream.flush();
//            objectOutputStream.close();
//            System.out.println("Written.");
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//    }
//    public static void readObjectToFile(){
//        try {
//            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("student.dat"));
//            StudentS studentS = (StudentS) objectInputStream.readObject();
//            objectInputStream.close();
//            System.out.println(studentS);
//        }catch (IOException ignore){}
//        catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//    }
//    public static void main(String[] args) {
//        StudentS studentS = new StudentS(1, "Na", new String[]{"Java"},new String[]{"Front"});
//       // writeObjectToString(studentS);
//        readObjectToFile();
//    }
//}
