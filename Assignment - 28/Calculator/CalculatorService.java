package Calculator;
import java.rmi.*;

public interface CalculatorService extends Remote {
    int add(int a, int b) throws RemoteException;
}