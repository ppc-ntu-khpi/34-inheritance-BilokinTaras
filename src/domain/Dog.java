package domain;

public class Dog extends Animal {

    public String kind;
    

    public Dog(String Name, int age, String kind) {
        this.Name = Name;
        this.age = age;
        this.kind = kind;
    }

    public Dog() {
        this("Jek", 2, "GAV");
    }

    
    public Dog(String Name) {
        this(Name, 2, "shepherd");
    }
    

    public void guarded() {
        System.out.println("Run, Jump, Fly learn so fast...");
    }

    @Override
    public String toString() {
        return super.toString()+"\nkind:"+this.kind+"\n\n I'am boss!";
    }

    @Override
    public void play() {
        System.out.println("Throw me a ball"); 
    }

    @Override
    public void eat() {
        System.out.println("I like this meat!"); 
    }
    
}
