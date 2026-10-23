package Temperature;
import java.rmi.*;
import java.rmi.server.*;

public class TemperatureImpl extends UnicastRemoteObject
        implements TemperatureService {

    TemperatureImpl() throws RemoteException {
        super();
    }

    public double toFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public double toCelsius(double f) {
        return (f - 32) * 5 / 9;
    }
}