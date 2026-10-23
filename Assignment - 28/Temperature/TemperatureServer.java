
package Temperature;
import java.rmi.*;
import java.rmi.registry.*;

public class TemperatureServer {
    public static void main(String[] args) throws Exception {
        LocateRegistry.createRegistry(1099);

        Naming.rebind("Temperature", new TemperatureImpl());

        System.out.println("Temperature server ready.");
    }
}