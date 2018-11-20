package com.test;

import java.io.*;
import java.net.*;


public class clientSocket {

	Socket socket;
	
	public void connect() {
		try {
			socket = new Socket("192.168.123.104", 7777);
			System.out.println("연결");
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		clientSocket clientSocket = new clientSocket();
		clientSocket.connect();
	}
	
}
