package RMI;

import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.UnicastRemoteObject;

public class Server extends Example {
	public Server() {}
	public static void main(String[] args) {
		try {
			Example ex = new Example();
			//
			Hello stub = (Hello) UnicastRemoteObject.exportObject(ex, 0);
			//
			Registry registry = LocateRegistry.getRegistry();
			//
			registry.bind("Hello", stub);
			System.err.println("Server Ready");
		}catch(Exception e) {
			System.err.println("Server Exception" + e.toString());
			e.printStackTrace();
		}
	}
}
