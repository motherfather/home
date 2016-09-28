package home;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
	private static final int PORT = 5000;

	public static void main(String[] args) {
		ServerSocket serverSocket = null;

		try {
			// 서버소켓 생성
			serverSocket = new ServerSocket();
			// 주소 획득
			InetAddress ia = InetAddress.getLocalHost();
			String ad = ia.getHostAddress();
			// 서버소켓 바인딩
			serverSocket.bind(new InetSocketAddress(ad, PORT));

			System.out.println("server open");
			while (true) {
				// 소켓 억셉트
				Socket socket = serverSocket.accept();
				Thread thread = new MyThread2(socket);
				thread.start();
				
			}

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (serverSocket != null && serverSocket.isClosed() == false) {
					serverSocket.close();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}

	}

}
