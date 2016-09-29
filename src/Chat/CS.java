package Chat;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.List;

public class CS {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		List<PrintWriter> list = new ArrayList<PrintWriter>();

		try {
			serverSocket = new ServerSocket();
			String address = InetAddress.getLocalHost().getHostAddress();

			String[] serverAddress = address.split(" ");
			serverSocket.bind(new InetSocketAddress(address, 9999));
		} catch (IOException e) {
			consoleLog("Error : " + e);
		} finally {

		}

	}

	public static void consoleLog(String message) {
		System.out.println(message);
	}

}
