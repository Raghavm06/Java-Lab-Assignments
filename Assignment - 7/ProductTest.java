interface Product {
    void display();
}

class ProductInfo {
    String name;
    double price;

    ProductInfo(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

class Electronic extends ProductInfo implements Product {

    Electronic(String name, double price) {
        super(name, price);
    }

    public void display() {
        System.out.println("Electronic : " + name);
        System.out.println("Price : " + price);
    }
}

class Clothing extends ProductInfo implements Product {

    Clothing(String name, double price) {
        super(name, price);
    }

    public void display() {
        System.out.println("Clothing : " + name);
        System.out.println("Price : " + price);
    }
}

class Grocery extends ProductInfo implements Product {

    Grocery(String name, double price) {
        super(name, price);
    }

    public void display() {
        System.out.println("Grocery : " + name);
        System.out.println("Price : " + price);
    }
}

public class ProductTest {
    public static void main(String[] args) {

        Electronic e = new Electronic("Laptop", 55000);
        Clothing c = new Clothing("T-Shirt", 999);
        Grocery g = new Grocery("Rice", 800);

        e.display();
        c.display();
        g.display();
    }
}