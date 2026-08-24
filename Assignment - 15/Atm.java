import java.util.Scanner;

public class Atm {

    static void checkPin(int pin) throws Exception {

        if (pin != 1234) {
            throw new Exception("Invalid PIN.");
        }

        System.out.println("PIN Verified.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter PIN: ");
            int pin = sc.nextInt();

            checkPin(pin);

        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());

        } finally {
            System.out.println("PIN Verification Completed.");
        }

        sc.close();
    }
}