package series.fun.java.chap06._02_Socket;

import java.io.Serializable;

public class SendData implements Serializable {
	int op1;
	int op2;
	String opcode;
	public SendData(int op1, int op2, String opcode) {
		this.op1 = op1;
		this.op2 = op2;
		this.opcode = opcode;
	}
	public int getOp1() {
		return op1;
	}
	public int getOp2() {
		return op2;
	}
	public String getOpcode() {
		return opcode;
	}
}















