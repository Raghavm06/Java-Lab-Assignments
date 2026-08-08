public class MobileDemo {

    String brand;
    String model;
    double price;

    // Default Constructor
    MobileDemo() {
        brand = "Samsung";
        model = "Galaxy A16";
        price = 18000;
    }

    // Parameterized Constructor
    MobileDemo(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Copy Constructor
    MobileDemo(MobileDemo m) {
        this.brand = m.brand;
        this.model = m.model;
        this.price = m.price;
    }

    void display() {
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Price : " + price);
        System.out.println();
    }

    public static void main(String[] args) {

        MobileDemo m1 = new MobileDemo();

        MobileDemo m2 = new MobileDemo("OnePlus", "Nord CE 5", 24999);

        MobileDemo m3 = new MobileDemo(m2);

        System.out.println("Default Constructor");
        m1.display();

        System.out.println("Parameterized Constructor");
        m2.display();

        System.out.println("Copy Constructor (Duplicate Record)");
        m3.display();
    }
}