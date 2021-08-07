package server1;

import java.net.*;
import java.io.*;

public class Server1 {
	public static void main(String[] args) throws IOException {
		DatagramSocket dsoc = new DatagramSocket(8008);
		byte[] b = new byte[787734];
		byte[] c;
		String str;
		File file = new File("D:/tuf docs/java.txt");
		FileOutputStream fout = new FileOutputStream(file);
		while(true) {
			DatagramPacket dp = new DatagramPacket(b, b.length);
			dsoc.receive(dp);
			str = new String(dp.getData(), 0, dp.getLength());
			System.out.println(str);
			fout.write(b);
			fout.flush();
			fout.close();
		}
	}
}
