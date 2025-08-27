package modifiers;

// instantly before class, variables, or methods in java, modifiers are placed.

public class Main {
    public static void main(String[] args) {

        /*
        1. Access control Modifier: Controls the level of access a defining class grants to other classes.

            a. public modifier: designates that all classes may access the defined aspect
                that is all other classes are allowed to created instances of the public class.
            
            b. protected Modifier: designates that access is only granted to following groups
                that are - 
                            1) Classes that are designated as subclasses of the given class through inheritance.
                            2) Classes that belong to the same package as the given class.
            
            c. private modifier: designates that acess can only be granted to code within that class itself.

            d. if we do not define any modifier a package-private acess level is defined which allows access in overall package.

        2. static Modifier: static modifier in Java can be declared for any variable or method of a class.
            Example - sqrt method in Math package is static as it can be used anywhere just by the help of a dot operator without the need for the user to define a constructor.
            uses - Math.sqrt(num a, num b);

        3. abstract Modifier: it used when a signature is provided but no body of the class or method is present at initial stages 
                -> Any subclass of a class with abstract methods is expected to provide a concrete implementation for each abstract method.

        4. final Modifier: a variable that is declared by final modifier has its value made constant.
            -> A final method cannot be overwritten by subclass, a final class cannot even be sub-classed.

        
            */
        
    }
}
