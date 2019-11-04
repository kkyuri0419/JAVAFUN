package series.fun.java.chap03.lec04;

public class ExceptionEx03 {
	
	public static String print(String str) {
		String[] toError = new String[1];
		try {
			toError[10] = str;
		}catch(Exception e) {
			System.out.println("오류 발생 : " + e);
			return e.getMessage(); //본래 return을 만나면 메서드가 종료되야함
		}finally { //그런데 finally가 있기 때문에 return하고 마무리 작업해야함
			System.out.println("finally 진입");
		}
		System.out.println("test");
		return "print()가 실행됬었다.";
	}
	
	public static void main(String[] args) {
		System.out.println(print("hello"));
	}
}
