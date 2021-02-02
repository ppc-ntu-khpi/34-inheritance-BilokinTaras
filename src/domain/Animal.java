package domain;

public class Animal {

    public String Name;

    public int age;

    public Animal() {
        Name = "generic animal";
        age = 2;
    }

    public void eat() {
        System.out.println("Nyam Nyam...");
    }

    public void play() {
        System.out.println("Catch the ball");
    }

    @Override
    public String toString() {
        return "Animal:" + "\nName:\t" + Name + ", \nage:\t" + age;
    }

   
}
