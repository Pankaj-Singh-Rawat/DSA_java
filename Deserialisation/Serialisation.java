package Deserialisation;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialisation {
    public static void main(String[] args) throws Exception {
        // Create a User object
        User user = new User();
        user.name = "Pankaj";
        user.pass = "12345";

        // Specify where to save it
        FileOutputStream fileOut = new FileOutputStream("/Users/psr/Documents/DSA_java/UserInfo.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);

        // Write the object to file
        out.writeObject(user);

        out.close();
        fileOut.close();

        System.out.println("✅ Serialized data saved successfully in UserInfo.ser");
    }
}
