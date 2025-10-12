import java.io.File;
import java.io.IOException;

public class FileHandeling {
    public static void main(String[] args) {
       File myFile = new File("testFile.txt");
       try{
        myFile.createNewFile();
       }catch(IOException e){
        System.out.println("unable to create this file");
        e.printStackTrace();
       }



    }
}   