package test;

import domain.Dog;
        

 /**
 * The class Test animal
 * @see Dog
 * @author Taras
 */ 
public class TestAnimal {


/** 
 *
 * Main
 *
 * @param args  the args
 */
    public static void main(String[] args) { 

        Dog dog1 = new Dog("Palma");
        System.out.println(dog1);
        dog1.guarded();
        dog1.eat();
        dog1.play();
        dog1.toString();
        
    }
}
