package client;

import java.io.*;
import client.*;
import common.*;

public class ClientConsole implements ChatIF {
	final public static int DEFAULT_PORT = 5555;
	ChatClient client;

	public ClientConsole(String host, int port) {
		client = new ChatClient(host, port, this);
	}

	public void accept() {
		try {
			BufferedReader fromConsole = new BufferedReader(new InputStreamReader(System.in));
			String message;
			
			try {
				while (true) {
					message = fromConsole.readLine();
					client.handleMessageFromClientUI(message);
				}
			} catch (NullPointerException e) { }
		} catch (Exception ex) {
			System.out.println("Unexcepted error while reading from console!");
		}
	}

	public void display(String message) {
		System.out.println(message);
	}

	public static void main(String[] args) {
		String host = "";
		int port = 0;
		try {
			host = args[0];
		} catch(ArrayIndexOutOfBoundsException e) {
			host = "localhost";
		}
		try {
			port = Integer.parseInt(args[2]);
		} catch (Throwable t) {
			port = DEFAULT_PORT;
		}
		ClientConsole chat = new ClientConsole(host, port);
		chat.accept();
	}
}