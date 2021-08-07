package myServer;

import java.io.*;
import java.net.*;

public class MyServer {
	public static void main(String[] args) {
		try {
			DatagramSocket skt = new DatagramSocket(9744);
			byte[] buffer = new byte[1000];
			while(true) {
				DatagramPacket request = new DatagramPacket(buffer, buffer.length);
				skt.receive(request);
				String[] message = (new String(request.getData())).split(" ");
				byte[] sendMsg = (message[0] + " server processed ! ").getBytes();
				DatagramPacket reply = new DatagramPacket(sendMsg, sendMsg.length, request.getAddress(), request.getPort());
				skt.send(reply);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
