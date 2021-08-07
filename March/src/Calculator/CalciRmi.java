package Calculator;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalciRmi extends UnicastRemoteObject implements CalciInterface {
	public CalciRmi() throws RemoteException{
		int x, y;
	}
	public int calculate(char operator , int x , int y) throws Exception{
		int result = 0;
		switch(operator) {
			case '+' : 
				result =  x+y;
				break;
			case '-' :
				result =  x-y;
				break;
			case '*' :
				result =  x*y;
				break;	
			case '/' :
				result =  x/y;
				break;	
			default : 
				System.out.println("Error! operator is not correct");
				return 0;
		}
		return result;
	}
}
