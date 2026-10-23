package Calculator;
import java.rmi.*;

public class CalculatorClient {
    public static void main(String[] args) throws Exception {
        CalculatorService c = (CalculatorService)
            Naming.lookup("rmi://localhost/Calculator");

        System.out.println("Sum: " + c.add(10, 20));
    }
}