package series.fun.java.chap03.lec04;

public class Intro {
	public static void main(String[] args) {
		String[] strArr = new String[5];
		
		strArr[10] = "hello"; //여기서 JVM으로 튕겨져 버림
		
		System.out.println("자바는 재밌어"); //그래서 여기는 실행이 안됨
	}
}
