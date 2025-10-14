package Deserialisation;

import java.io.Serializable;

public class User implements Serializable {
    String name;
    String pass;

    public void sayHello(){
        System.out.println("Hello " + name);
    }
}
