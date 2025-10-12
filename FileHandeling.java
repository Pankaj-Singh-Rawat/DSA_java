import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandeling {
    public static void main(String[] args) {
    //    File myFile = new File("testFile.txt");
    //    try{
    //     myFile.createNewFile();
    //    }catch(IOException e){
    //     System.out.println("unable to create this file");
    //     e.printStackTrace();
    //    }

    // // code to write a file
    // try{
    //     FileWriter fileWriter = new FileWriter("testFile.txt");
    //     fileWriter.write("This is our first line from this java course.");
    //     fileWriter.close();
    // }catch(IOException e){
    //     e.printStackTrace();;
    // }

    // // reading a file 
    // File myFile = new File("testFile.txt");
    // try{
    //     Scanner sc = new Scanner(myFile);
    //     while(sc.hasNextLine()){
    //         String line = sc.nextLine();
    //         System.out.println(line);
    //     }
    //     sc.close();
    // }catch(IOException e){
    //     e.printStackTrace();
    // }

    // how to delete a file
    File myFile = new File("testFile.txt"); 
    if(myFile.delete()){
        System.out.println("I have deleted: "+ myFile.getName());
    }else{
        System.out.println("Some problem occured while deleting the file.");
    }
    }
}   