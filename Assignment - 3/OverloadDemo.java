public class OverloadDemo {

    static String college = "SIT Pune";

    void display() {
        System.out.println("Welcome to " + college);
    }

    void add(int a, int b) {
        System.out.println("Sum of two integers = " + (a + b));
    }

    void add(double a, double b) {
        System.out.println("Sum of two doubles = " + (a + b));
    }

    void add(int a, int b, int c) {
        System.out.println("Sum of three integers = " + (a + b + c));
    }

    static void showCollege() {
        System.out.println("College : " + college);
    }

    public static void main(String[] args) {

        OverloadDemo obj = new OverloadDemo();

        obj.display();
        obj.add(10, 20);
        obj.add(12.5, 7.5);
        obj.add(5, 10, 15);

        showCollege();
    }
}
