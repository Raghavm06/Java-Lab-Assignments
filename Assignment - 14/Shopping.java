import java.util.Scanner;

public class Shopping {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter product quantity: ");
            int quantity = sc.nextInt();

            if (quantity <= 0) {
                throw new Exception("Invalid product quantity.");
            }

            System.out.println("Order placed successfully.");
            System.out.println("Quantity: " + quantity);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}