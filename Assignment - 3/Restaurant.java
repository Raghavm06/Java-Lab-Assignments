public class Restaurant {

    static int totalOrders = 0;

    // Dine-in
    double calculateBill(double amount) {
        totalOrders++;
        return amount;
    }

    // Takeaway (includes packing charge)
    double calculateBill(double amount, double packingCharge) {
        totalOrders++;
        return amount + packingCharge;
    }

    // Delivery (includes packing and delivery charges)
    double calculateBill(double amount, double packingCharge, double deliveryCharge) {
        totalOrders++;
        return amount + packingCharge + deliveryCharge;
    }

    static void showTotalOrders() {
        System.out.println("Total Orders : " + totalOrders);
    }

    public static void main(String[] args) {

        Restaurant order = new Restaurant();

        System.out.println("Dine-in Bill    : " + order.calculateBill(500));
        System.out.println("Takeaway Bill   : " + order.calculateBill(500, 20));
        System.out.println("Delivery Bill   : " + order.calculateBill(500, 20, 50));

        showTotalOrders();
    }
}