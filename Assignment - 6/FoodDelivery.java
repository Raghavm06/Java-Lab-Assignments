interface Status {
    void update();
}

public class FoodDelivery {

    String orderId = "FD101";
    String item = "Veg Burger";

    class Order {

        void display() {
            System.out.println("Order ID : " + orderId);
            System.out.println("Item     : " + item);
        }
    }

    public static void main(String[] args) {

        FoodDelivery f = new FoodDelivery();

        FoodDelivery.Order o = f.new Order();
        o.display();

        Status s = new Status() {

            @Override
            public void update() {
                System.out.println("Order Delivered");
            }
        };

        s.update();
    }
}