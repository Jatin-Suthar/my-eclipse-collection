package RMI;

import java.rmi.*;

public interface Hello extends Remote {
	void printmsg() throws Exception;
}
