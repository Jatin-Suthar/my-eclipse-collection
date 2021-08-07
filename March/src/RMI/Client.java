package RMI;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
	private Client() {}
	public static void main(String[] args) {
		try {
			Registry registry = LocateRegistry.getRegistry();
			//
			Hello stub = (Hello) registry.lookup("Hello");
			//
			stub.printmsg();
			
		}catch (Exception e) {
			System.err.println("Client Excetion" + e.toString());
			e.printStackTrace();
		}
	}
}
