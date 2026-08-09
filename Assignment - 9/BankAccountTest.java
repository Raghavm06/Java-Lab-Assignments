class Account {

    final int accountNo = 101;

    void display() {
        System.out.println("Account Number: " + accountNo);
    }
}

public class BankAccountTest {

    public static void main(String[] args) {

        Account a = new Account();

        a.display();
    }
}