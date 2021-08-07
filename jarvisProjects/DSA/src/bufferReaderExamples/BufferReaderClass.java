package bufferReaderExamples;

import java.io.*;

public class BufferReaderClass {
	public static void main(String[] args) throws Exception {
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		System.out.println("enter your name");
		String name = br.readLine();
		System.out.println("welcome " + name);
		System.out.println("enter roll no. ");
		char roll[] = new char[9];
		for(int i = 0 ; i < 9 ; i++) {
			roll[i] = (char) br.read();
		}
		System.out.print("your roll no. is "); 
		for(int i = 0 ; i < 9 ; i++) {
			System.out.print(roll[i]);
		}	
		br.close();
		r.close();
	}
}
