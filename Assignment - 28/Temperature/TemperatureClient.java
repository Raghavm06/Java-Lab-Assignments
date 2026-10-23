
package Temperature;
import java.rmi.*;

public class TemperatureClient {
    public static void main(String[] args) throws Exception {
        TemperatureService t = (TemperatureService)
            Naming.lookup("rmi://localhost/Temperature");

        System.out.println("25 C = " + t.toFahrenheit(25) + " F");
        System.out.println("77 F = " + t.toCelsius(77) + " C");
    }
}