// Animal.java

public class Animal {

    String type;


    public Animal(String type) {
        this.type = type;
    }

    public void sound() {
        System.out.println("Animal makes a sound");
    }

    public void sound(String name) {
        System.out.println(name + " makes a unique sound");
    }

    public void showType() {
        System.out.println("Type: " + type);
    }
}
