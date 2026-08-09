class Vehicle {

    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    void display() {
        System.out.println("Vehicle Brand: " + brand);
    }
}

class CarInsurance extends Vehicle {

    String brand;

    CarInsurance(String brand) {
        super("Toyota");
        this.brand = brand;
    }

    void display() {
        System.out.println("Vehicle Brand: " + super.brand);
        System.out.println("Insurance Type: Car Insurance");
        System.out.println("Insured Vehicle: " + brand);
    }
}

public class VehicleInsurance {

    public static void main(String[] args) {

        CarInsurance c = new CarInsurance("Toyota Corolla");

        c.display();
    }
}