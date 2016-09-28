package home;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	private static final int PORT = 5000;

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket();
			
			String ad = InetAddress.getLocalHost().getHostAddress();
//			InetAddress ia = InetAddress.getLocalHost();
//			String ad2 = ia.getHostAddress();
			
			serverSocket.bind(new InetSocketAddress(ad, PORT));
			
			while(true) {
				Socket socket = serverSocket.accept();
				
				Thread myThread = new MyThread(socket);
				
				myThread.start();
				
			}
			
			
		} catch (IOException ex) {
			ex.printStackTrace();
		}

	}

}
