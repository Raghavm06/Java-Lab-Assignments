package Calculator;
import java.rmi.*;
import java.rmi.registry.*;

public class CalculatorServer {
    public static void main(String[] args) throws Exception {
        LocateRegistry.createRegistry(1099);

        Naming.rebind("Calculator", new CalculatorImpl());

        System.out.println("Calculator server ready.");
    }
}