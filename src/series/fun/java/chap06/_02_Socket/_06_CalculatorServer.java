package series.fun.java.chap06._02_Socket;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*시리얼라이즈 IO
 * 장점 : 원하는 객체를 묶어서 보낼 수 있다.
 *       데이터 추출이 매우 쉽다.
 * 단점 : 속도가 상당히 느리다
 * */
public class _06_CalculatorServer {
	public static void main(String[] args) {
		Socket sock = null;
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		try {
			ServerSocket ss = new ServerSocket(10005);
			System.out.println("<서버>클라이언트의 접속에 대기...");
			sock = ss.accept();
			oos = new ObjectOutputStream(sock.getOutputStream());
			ois = new ObjectInputStream(sock.getInputStream());
			Object obj = null;
			while((obj = ois.readObject()) != null) {
				SendData sd = (SendData)obj;
				int op1 = sd.getOp1();
				int op2 = sd.getOp2();
				String opcode = sd.getOpcode();
				if(opcode.equals("+")) {
					oos.writeObject(op1 + " + " + op2 + " = " + (op1+op2));
					oos.flush();
				}else if(opcode.equals("-")) {
					oos.writeObject(op1 + " - " + op2 + " = " + (op1-op2));
					oos.flush();
				}else if(opcode.equals("*")) {
					oos.writeObject(op1 + " * " + op2 + " = " + (op1*op2));
					oos.flush();
				}else if(opcode.equals("/")) {
					if(op2 == 0) {
						oos.writeObject("0으로 나눌 수 없습니다.");
						oos.flush();
					}else {
						oos.writeObject(op1 + " / " + op2 + " = " + (op1/op2));
						oos.flush();
					}
				}else {
					oos.writeObject("연산자 잘못 보냈습니다.");
					oos.flush();
				}
				System.out.println("<서버>결과를 전송했습니다.");
			}
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			try {
				if(oos != null) oos.close();
				if(ois != null) ois.close();
				if(sock != null) sock.close();
			}catch(Exception ex) {
				System.out.println(ex);
			}
		}
	}
}













