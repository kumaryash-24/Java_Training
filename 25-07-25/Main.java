// Abstract class
abstract class Animal {

    // Abstract method (no body)
    abstract void makeSound();

    // Regular method
    void eat() {
        System.out.println("Animal is eating");
    }
}


class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks ");
    }
}


class Cat extends Animal {
    
    void makeSound() {
        System.out.println("Cat meows");
    }
}


public class Main{
    public static void main(String[] args) {
        Animal a1 = new Dog(); 
        Animal a2 = new Cat();

        a1.makeSound();
        a1.eat();        

        a2.makeSound();
        a2.eat();        
    }
}
