package Calculator;

import java.rmi.registry.Registry;

public class CalciServer {
	public static void main(String[] args) {
		try {
			Registry registry = java.rmi.registry.LocateRegistry.createRegistry(1099);
			registry.rebind("Calculator", new CalciRmi());
			System.out.println("Server not connected!");
		}catch (Exception e) {
			System.out.println("Server Not Connected! " + e);
		}
	}
}
