interface Action {
    void perform();
}

public class Vehicle {

    String brand = "TVS";
    String model = "Apache RTR 160";

    class Details {

        void display() {
            System.out.println("Brand : " + brand);
            System.out.println("Model : " + model);
        }
    }

    public static void main(String[] args) {

        Vehicle v = new Vehicle();

        Vehicle.Details d = v.new Details();
        d.display();

        Action a = new Action() {

            public void perform() {
                System.out.println("Vehicle Started");
            }

        };

        a.perform();
    }
}