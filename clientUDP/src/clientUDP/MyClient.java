package clientUDP;

import java.io.*;
import java.net.*;

public class MyClient {
	public static void main(String[] args) {
		try {
			DatagramSocket skt = new DatagramSocket();
			String msg = "my first datagram program ";
			byte[] x = msg.getBytes();
			InetAddress host = InetAddress.getByName("localhost");
			int serverSocket = 9744;
			DatagramPacket request = new DatagramPacket(x, x.length, host, serverSocket);
			skt.send(request);
			
			//----------------------------------------------------------------------------//
			
			byte[] buffer = new byte[1000];
			DatagramPacket reply = new DatagramPacket(buffer, buffer.length);
			skt.receive(reply);
			System.out.println("Client recieved : " + new String(reply.getData()));
			skt.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
