public class Calculator {

    static int count = 0;

    int add(int a, int b) {
        count++;
        return a + b;
    }

    double add(double a, double b) {
        count++;
        return a + b;
    }

    static void showCount() {
        System.out.println("Total Calculations : " + count);
    }

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println("Integer Addition : " + calc.add(10, 20));
        System.out.println("Decimal Addition : " + calc.add(12.5, 7.5));

        showCount();
    }
}