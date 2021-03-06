package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerThread extends Thread {
	static ServerSocket serverSocket = null;
	
	@Override
	public void run() {
		try {
			serverSocket = new ServerSocket(10009);
			while (true) {
				try {
				Socket socket = serverSocket.accept();
				Thread thread = new ChatThread(socket);
				thread.start();
				
				}catch (Exception e) {
					break;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {	
			if (serverSocket != null) {	try {serverSocket.close();} catch (IOException e) {	e.printStackTrace();}}
		}
	}

	
}
