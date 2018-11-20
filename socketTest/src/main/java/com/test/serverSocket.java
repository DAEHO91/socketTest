package com.test;

import java.io.*;
import java.net.*;

public class serverSocket {
	ServerSocket serverSocket;
	Socket socket;
	
	public void setting() {
		try {
			serverSocket = new ServerSocket(7777);
			System.out.print("서버 대기");
			socket = serverSocket.accept();
			System.out.print(socket.getInetAddress()+"에서 접속");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		serverSocket serverSocket = new serverSocket();
		serverSocket.setting();
	}

}
