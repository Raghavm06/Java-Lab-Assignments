class Task implements Runnable {
    String name;

    Task(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + ": " + i);
        }
    }
}

public class RunnableDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Task("Task 1"));
        Thread t2 = new Thread(new Task("Task 2"));

        t1.start();
        t2.start();
    }
}   