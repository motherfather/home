package home;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class MyThread2 extends Thread {
	Socket socket = null;

	public MyThread2(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "utf-8"));
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "utf-8"), true);

			while (true) {
				String data = br.readLine();
				if (data == null) {
					break;
				}
				System.out.println("Data input : " + data);
				pw.println("Echo " + data);
				System.out.println("Data output : " + data);
			
			}
			
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (socket != null && socket.isClosed() == false) {
					socket.close();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}

		}
	}

}
