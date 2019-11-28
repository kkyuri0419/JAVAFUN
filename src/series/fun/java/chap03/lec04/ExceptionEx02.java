package series.fun.java.chap03.lec04;

public class ExceptionEx02 {
	
	public static void main(String[] args) {
		try {
			String[] strArr = new String[5];
			strArr[10] = "hello";
			int num =10/0;
			System.out.println("Here");
		}catch(ArithmeticException e){
			java.lang.System.out.println("0으로 나눌 순 없음:" + e);
		}
		System.out.println("프로그램 정상 종");
	}
	
}
