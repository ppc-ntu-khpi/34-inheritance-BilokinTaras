package domain;


 /**
 * The main class Animal
 * @author Taras
 */ 
public class Animal {

    public String Name;

    public int age;


/** 
 *
 * It is a constructor. 
 *
 */
    public Animal() { 

        Name = "generic animal";
        age = 2;
    }


/** 
 *
 *  Constructor Eat
 *
 */
    public void eat() { 

        System.out.println("Nyam Nyam...");
    }


/** 
 *
 * Constructor Play
 *
 */
    public void play() { 

        System.out.println("Catch the ball");
    }

    @Override

/** 
 *
 * Print to string of name and age dog
 *
 * @return String
 */
    public String toString() { 

        return "Animal:" + "\nName:\t" + Name + ", \nage:\t" + age;
    }

   
}
