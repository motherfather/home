package home;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;

public class Server {
	private static final int PORT = 7777;

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket();
			
			serverSocket.bind(new InetSocketAddress(InetAddress.getLocalHost().getHostAddress(), PORT));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
