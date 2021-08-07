package client1;

import java.net.*;
import java.io.*;

public class Client1 {
	private final static int BUFFER_SIZE = 4096;
	public static void main(String[] args) throws IOException {
		byte b[] = new byte[787734];
		FileInputStream f = new FileInputStream("D://clientsenddata.txt");
		DatagramSocket dsoc = new DatagramSocket(2000);
		int i = 0;
		byte[] buffer = new byte[BUFFER_SIZE];
		while(f.read(buffer) != -1) {
			b[i] = (byte)f.read();
			i++;
		} 
		f.close();
	}
}
