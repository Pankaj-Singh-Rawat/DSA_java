package Serialisation;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialisation {
    /*
     * Serialisation: Process of converting a a object into byte stream
     * Object persists (saves the state) of the object after it exists
     * Byte stream can be saved as a file (.ser) which is platform independent
     * 
     * Deserialisation: The process of converting a byte stream back into object
     * Eg: Loading a saved file
     */
    public static void main(String[] args) throws Exception {
        
                // Steps to serialise an Object:
                /*
                 * 1. your object should implement Serialisable Interface
                 * 2. add java.io.Serialisable
                 * 3. FileOutputStream fileOut = new fileOutputStream(File Path)
                 * 4. ObjectOutputStream out = new ObjectOutputStream(file out)
                 * 5. out.wirteObject(object name)
                 * 6. out.close(); fileOut.close();
                 */
                
        User user = new User();
        user.name = "Bro";
        user.pass = "broCode";

        FileOutputStream fileOut = new FileOutputStream("UserInfo.ser");

        ObjectOutputStream out = new ObjectOutputStream(fileOut);

        out.writeObject(user);

        out.close();
        fileOut.close();

        System.out.println("Object info saved.");
    }
}
