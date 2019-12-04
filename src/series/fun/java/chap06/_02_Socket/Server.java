package series.fun.java.chap06._02_Socket;

import java.util.*;
import java.net.*;
import java.io.*;

class ChattingThread extends Thread{

	Socket sock;
	InputStream input;
	OutputStream output;
	BufferedReader br;//받는거
	PrintWriter pw;

	ChattingThread(Socket sock){
		try {
			this.sock = sock;
			input = sock.getInputStream();
			output = sock.getOutputStream();
			this.br = new BufferedReader(new InputStreamReader(input));
			this.pw = new PrintWriter(new OutputStreamWriter(output));
		}catch(Exception e){
			System.out.println(e);
		}
	}

	@Override
	public void run() {
		
		String msg = "";
		
		while(true) {
			try {
				msg = br.readLine();
				System.out.println("클라이언트로부터 도착한 메시지: "+ msg);
				pw.println(msg);
				pw.flush();
			}catch(Exception e) {
				System.out.println(e);
			}
		}

	}

}

public class Server {

	public static void main(String[] args) {
		Socket sock = null;

		try {//io통신을 할 떄는 try catch문을 써줘야 한다.
			//TCP, UD
			//IP address
			//Port
			ServerSocket server = new ServerSocket();
			InetSocketAddress ipep = new InetSocketAddress(10101);//10101이 port
			server.bind(ipep);

			int cnt = 0;//접속 횟수

			while(true) {
				System.out.println("접속을 기다리는 중...");
				sock = server.accept();
				System.out.println("접속이 되었습니다.");
				if (sock.isConnected()) {
					cnt++;
					System.out.println("접속 횟수 : "+cnt);
					System.out.println("클라이언트 정보: " + sock.getInetAddress());//Client의 IP
					System.out.println("서버 정보: " + sock.getLocalAddress());//Server IP
					ChattingThread getClient = new ChattingThread(sock);
					getClient.start();

				}

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
