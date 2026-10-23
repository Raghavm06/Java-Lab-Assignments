class Account {
    int balance = 1000;

    synchronized void deposit() {
        balance += 500;
        System.out.println("Deposit: 500");
        System.out.println("Balance: " + balance);
    }

    synchronized void withdraw() {
        balance -= 300;
        System.out.println("Withdrawal: 300");
        System.out.println("Balance: " + balance);
    }
}

public class RunnableBank {
    public static void main(String[] args) {
        Account a = new Account();

        Thread t1 = new Thread(() -> a.deposit());
        Thread t2 = new Thread(() -> a.withdraw());

        t1.start();
        t2.start();
    }
}