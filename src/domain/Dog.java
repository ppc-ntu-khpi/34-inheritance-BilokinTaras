package domain;


 /**
 * The class Dog extends animal
 * @see Animal
 * @author Taras
 */ 
public class Dog extends Animal {

    public String kind;
    


/** 
 *
 * Constructor Dog
 *
 * @param Name  the name
 * @param age  the age
 * @param kind  the kind
 */
    public Dog(String Name, int age, String kind) { 

        this.Name = Name;
        this.age = age;
        this.kind = kind;
    }


/** 
 *
 * Constructor Dog
 *
 */
    public Dog() { 

        this("Jek", 2, "GAV");
    }

    

/** 
 *
 * Dog
 *
 * @param Name  the name
 * @return string value of Name
 */
    public Dog(String Name) { 

        this(Name, 2, "shepherd");
    }
    


/** 
 *
 * Constructor Guarded
 *
 */
    public void guarded() { 

        System.out.println("Run, Jump, Fly learn so fast...");
    }

    @Override

/** 
 *
 * Print to string of kind dog
 *
 * @return String
 */
    public String toString() { 

        return super.toString()+"\nkind:"+this.kind+"\n\n I'am boss!";
    }

    @Override

/** 
 *
 * Constructor Play
 *
 */
    public void play() { 

        System.out.println("Throw me a ball"); 
    }

    @Override

/** 
 *
 * Constructor Eat
 *
 */
    public void eat() { 

        System.out.println("I like this meat!"); 
    }
    
}
