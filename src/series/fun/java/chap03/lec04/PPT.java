package series.fun.java.chap03.lec04;
//PPT 참고
public class PPT {
	
	class ZeroEx extends Exception{
		ZeroEx(){
			super("0으로 나눌 수 없");
		}
	}
	
	public static void main(String[] args) {
		try {
			int num = 10/0; //throw new ArithmeticException()
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
