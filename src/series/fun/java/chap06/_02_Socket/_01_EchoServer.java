package series.fun.java.chap06._02_Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/*서버는 서비스를 제공하는 프로그램을 일컫는다.
 * 고정된 주소를 가지고 접속 요청하는 클라이언트 프로그램과
 * 스트림을 형성한다.
 * 스트림이 형성되면 데이터의 송수신이 가능하다
 * 작업이 완료되면 close를 통해 스트림을 해제한다*/
// Echo Server : 클라이언트가 보낸 데이터를 그대로 돌려주는 서버
public class _01_EchoServer {
	public static void main(String[] args) {
		try {
			// port : Host(pc)에 있는 여러 개의 서버프로그램중에
			// 포트 번호로 원하는 소켓을 찾는다.
			// 주소 : ip address : 강원랜드   , Host까지 찾을 수 있다.
			//       port       : 바카라룸   , Host내의 특정 프로그램(소켓)
			// ip주소는 따로 설정하지 않아도 현재 Host의 주소를 사용
			// ipconfig
			ServerSocket server = new ServerSocket(10001);
			System.out.println("접속을 기다립니다...");
			// 클라이언트가 접속하기를 대기하고, 연결되면 연결 소켓을 반환
			// 이 연결소켓으로 통신을 할 수 있다.
			// accept는 연결전에는 함수를 반환하지 않고
			// 연결되어야 반환한다
			Socket sock = server.accept(); 
			InetAddress inetaddr = sock.getInetAddress();
			System.out.println(inetaddr.getHostAddress() + "로부터 접속");
			// 통신가능객체 생성
			OutputStream out = sock.getOutputStream();	// 전송
			InputStream in = sock.getInputStream();		// 수신
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			// 통신시작
			String line;
			/*null이 아닌 경우는 문자열 수신
			 *null인 경우는 접속 종료*/
			while((line = br.readLine()) != null) {
				System.out.println("클라이언트로부터 수신 : " + line);
				pw.println(line);	// 클라이언트한테 echo 송신
				pw.flush();			// 즉각 전송해라
			}
			System.out.println("클라이언트-서버 종료");
			pw.close();
			br.close();
			sock.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}






