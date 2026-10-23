package Temperature;
import java.rmi.*;

public interface TemperatureService extends Remote {
    double toFahrenheit(double c) throws RemoteException;
    double toCelsius(double f) throws RemoteException;
}