package series.fun.java.chap06._02_Socket;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

class HttpThread extends Thread{
	Socket sock = null;
	BufferedReader br = null;
	PrintWriter pw = null;
	public HttpThread(Socket sock) {
		this.sock = sock;
		try {
			br = new BufferedReader(
					new InputStreamReader(sock.getInputStream()));
			pw = new PrintWriter(
					new OutputStreamWriter(sock.getOutputStream()));
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	public void run() {
		BufferedReader fbr = null;
		try {
			String line = br.readLine();
			int start = line.indexOf(" ") + 2;
			int end  =line.lastIndexOf("HTTP") - 1;
			String filename = line.substring(start, end);
			if(filename.equals(""))
				filename = "index.html";
			System.out.println("사용자가 " + filename + "을 요청했습니다");
			fbr = new BufferedReader(new FileReader(filename));
			String fline = null;
			while((fline = fbr.readLine()) != null) {
				pw.println(fline);
				pw.flush();
			}
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			try {
				if(fbr != null) fbr.close();
				if(br != null) br.close();
				if(pw != null) pw.close();
				if(sock != null) sock.close();
			}catch(Exception ex) {
				System.out.println(ex);
			}
		}
	}
}

public class _05_SimpleWebServer {
	public static void main(String[] args) {
		try {
			// Http서버의 default port => 80
			// 생성자에서 jvm으로부터 소켓메모리를 할당받고
			// ip와 port를 bind하는 과정을 거친다.
			ServerSocket ss = new ServerSocket(80);
			while(true) {
				System.out.println("<서버>접속을 대기합니다...");
				// 대기하고 있다가 접속하면 소켓을 반환한다
				// 소켓에는 연결된 in/out 스트림 정보가 존재한다.
				Socket sock = ss.accept();
				System.out.println("<서버>새로운 쓰레드를 시작합니다");
				HttpThread ht = new HttpThread(sock);
				ht.start();
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}














