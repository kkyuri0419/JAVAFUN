package series.fun.java.chap03.lec04;

public class ExceptionEx01 {
 public static void main (String[] args) {
	 String[] strArr = new String[5];
	 try {
		 strArr[10] = "hello";
	 }catch( java.lang.ArrayIndexOutOfBoundsException e) {
		 System.out.println("인덱스 초과: "+e);
	 }
	 System.out.println("자바는 재밌");
	 System.out.println("프로그램 정상 종료");
 }
}
