package series.fun.java.chap06._04_SocketAdvanced;

import java.util.*;
import java.net.*;
import java.io.*;

class ChattingThread extends Thread{

	Socket sock;
	InputStream input;
	OutputStream output;
	BufferedReader br;
	PrintWriter pw;
	HashSet<PrintWriter> clientStorage;
	
	
	ChattingThread(Socket sock, HashSet<PrintWriter> clientStorage){
		try {
			this.sock = sock;
			input = sock.getInputStream();
			output = sock.getOutputStream();
			this.br = new BufferedReader(new InputStreamReader(input));
			this.pw = new PrintWriter(new OutputStreamWriter(output));
			this.clientStorage = clientStorage;
			synchronized(clientStorage) {
				clientStorage.add(pw);
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Override
	public void run() {
		
		String msg = "";
		
		while(true) {
			try {
				msg = br.readLine();
				Iterator<PrintWriter> itr = clientStorage.iterator();
				while(itr.hasNext()) {
					PrintWriter tmp = itr.next();
					tmp.println(msg);
					tmp.flush();
				}
			}catch(Exception e){
				System.out.println(e);
			}//try~catch
		}//while
	}//run()
}

public class Server {
	
	public static void main(String[] args) {
		
		Socket sock = null;
		
		//client의 PrintWriter 객체들을 담아아서 broadcasting 기능 구현
		HashSet<PrintWriter> clientStorage = new HashSet<PrintWriter>();
		
		try {
			//TCP, UDP
			//IP address
			//Port
			ServerSocket server = new ServerSocket();
			InetSocketAddress ipep = new InetSocketAddress(10101);
			server.bind(ipep);
			
			int cnt = 0; //접속 횟수
			
			while(true){
				System.out.println("접속을 기다리는 중...");
				sock = server.accept();
				System.out.println("접속이 되었습니다.");
				if(sock.isConnected()) {
					cnt++;
					System.out.println("접속 횟수 : " + cnt);
					System.out.println("클라이언트 정보 : " + sock.getInetAddress());
					System.out.println("서버 정보 : " + sock.getLocalAddress());
					ChattingThread getClient = new ChattingThread(sock, clientStorage); //Thread 생성
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
