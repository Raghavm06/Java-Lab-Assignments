11. Write a Java program to demonstrate the implementation of interfaces.
interface Animal {
    void eat();
    void sleep();
}

class Dog implements Animal {
    public void eat() {
        System.out.println("Dog is eating");
    }

    public void sleep() {
        System.out.println("Dog is sleeping");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.sleep();
    }
}

