abstract class FoodOrder {

    abstract void calculateBill();

    void message() {
        System.out.println("Food Order");
    }
}

class DineInOrder extends FoodOrder {

    void calculateBill() {
        double amount = 500;
        double serviceCharge = 50;

        System.out.println("Dine-In Bill: " + (amount + serviceCharge));
    }
}

class TakeAwayOrder extends FoodOrder {

    void calculateBill() {
        double amount = 500;
        double packingCharge = 20;

        System.out.println("Take-Away Bill: " + (amount + packingCharge));
    }
}

public class FoodOrderTest {

    public static void main(String[] args) {

        DineInOrder d = new DineInOrder();
        d.message();
        d.calculateBill();

        TakeAwayOrder t = new TakeAwayOrder();
        t.message();
        t.calculateBill();
    }
}