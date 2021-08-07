package Calculator;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class CalciClient {
	public static void main(String[] args) {
		try {
			CalciInterface c = (CalciInterface) Naming.lookup("//localhost/Calculator");
			Scanner sc = new Scanner(System.in);
			String s = sc.next();
			char operator = s.charAt(0);
			int x = sc.nextInt();
			int y = sc.nextInt();
			c.calculate(operator, x, y);
		} catch (Exception e) {
			System.out.println("Server not Connected! " + e);
		}
	}
}
