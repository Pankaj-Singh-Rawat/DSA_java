package Deserialisation;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerialisation {
    
    public static void main(String[] args) throws Exception {
        // Steps to Deserialise
        /*
         * 1. Declare your object (Don't Instantiate)
         * 2. your class should implement Serialisable interface
         * 3. add import java.io.Serialisable
         * 4. FileInputStream fileIn = new FileInputStream(file path)
         * 5. ObjectInputStream in = new ObjectInputStream(fileIn);
         * 6. ObjectName = (Class) in.readObject();
         * 7. in.close(); fileIn.close();
         */


        User user = null;
        FileInputStream fileIn = new FileInputStream("/Users/psr/Documents/DSA_java/UserInfo.ser");

        ObjectInputStream in = new ObjectInputStream(fileIn);

        user = (User) in.readObject();

        in.close();
        fileIn.close();

        System.out.println(user.name);
        System.out.println(user.pass);
        user.sayHello();
    }
}
