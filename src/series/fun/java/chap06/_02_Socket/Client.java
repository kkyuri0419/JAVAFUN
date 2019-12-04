package series.fun.java.chap06._02_Socket;

import java.util.*;
import java.net.*;
import java.io.*;

class ClientThread extends Thread{


	Socket sock;
	InputStream input;
	OutputStream output;
	BufferedReader br;//받는거
	PrintWriter pw;
	BufferedReader keyboard;


	ClientThread(Socket sock){
		try {
			this.sock = sock;
			input = sock.getInputStream();
			output = sock.getOutputStream();
			this.br = new BufferedReader(new InputStreamReader(input));
			this.pw = new PrintWriter(new OutputStreamWriter(output));
			this.keyboard = new BufferedReader(new InputStreamReader(System.in));
		}catch(Exception e){
			System.out.println(e);
		}
	}

	@Override
	public void run() {

		String msg = "";
		try {
			while(true) {

				msg = keyboard.readLine();
				pw.println(msg);
				pw.flush();

				msg = br.readLine();
				System.out.println("서로부터 도착한 메시지: "+ msg);

			}

		}catch(Exception e) {
			System.out.println(e);
		}finally {
			try {
				if(sock != null) {
					sock.close();
				}
			}catch(Exception e) {
				System.out.println(e);
			}
		}



	}

}

public class Client {
	public static void main(String[] args) {
		Socket sock = new Socket();
		try {
			InetSocketAddress ipep = new InetSocketAddress("127.0.0.1",10101);

			sock.connect(ipep);

			System.out.println(sock.isConnected());
			ClientThread toServer = new ClientThread(sock);
			toServer.start();

		}catch(Exception e) {
			System.out.println(e);
		}

	}
}//cmd + a, cmd + i
