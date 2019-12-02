package series.fun.java.chap06._02_Socket;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/* echo : 클라이언트가 보내온 메시지를 그대로 돌려보낸다
 * thread : 여러 클라이언트가 접속 시 클라이언트 당 1개 쓰레드가 전담한다
 *         그러면 동시에 서비스가 가능하다
 * */
public class _03_EchoThreadServer {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(10001);
			System.out.println("접속을 기다립니다...");
			while(true) {
				// 1. 클라이언트가 접속
				Socket sock = server.accept();
				// 2. 클라이언트 담당 쓰레드 생성하여 전담시킴
				EchoThread echothread = new EchoThread(sock);
				echothread.start();
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}

class EchoThread extends Thread{
	Socket sock;
	public EchoThread(Socket sock) {
		this.sock = sock;
	}
	public void run() {
		try {
			InetAddress inetaddr = sock.getInetAddress();
			System.out.println(inetaddr.getHostAddress() + 
								"로부터 접속했습니다.");
			OutputStream out = sock.getOutputStream();
			InputStream in = sock.getInputStream();
			PrintWriter pw = new PrintWriter(
								new OutputStreamWriter(out));
			BufferedReader br = new BufferedReader(
								new InputStreamReader(in));
			String line;
			while((line = br.readLine()) != null) {
				System.out.println("클라이언트로부터 수신: " + line);
				pw.println(line);
				pw.flush();
			}
			System.out.println(inetaddr.getHostAddress() +
								"클라이언트 접속 종료");
			pw.close();
			br.close();
			sock.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}











