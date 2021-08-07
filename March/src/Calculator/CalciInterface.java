package Calculator;

import java.rmi.Remote;

public interface CalciInterface extends Remote {
	public int calculate(char operator , int x , int y) throws Exception ;
}
