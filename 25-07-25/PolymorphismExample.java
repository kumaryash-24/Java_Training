// PolymorphismExample.java

public class PolymorphismExample {
    public static void main(String[] args) {

        System.out.println("=== Overloading + Constructor ===");
        Animal generic = new Animal("Generic Animal");
        generic.showType();
        generic.sound();            
        generic.sound("Elephant");   

        System.out.println("\n=== Overriding + Polymorphism ===");
        Animal dog = new Dog();   
        Animal cat = new Cat();   

        dog.showType();
        dog.sound(); 

        cat.showType();
        cat.sound();
    }
}
