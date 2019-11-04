package series.fun.java.chap03.lec01;

class Init{

	int num;
	static String str;

	//인스턴스 초기화
	{
		System.out.println("인스턴스 초기화 호출!!!");
		num = 10;
	}

	//클래스 초기화
	static {
		System.out.println("클래스 초기화 호출");
		str = "Java";
	}

	Init(){
		System.out.println("생성자 호출");
	}

	public void info() {
		System.out.println("num : " + num);
		System.out.println("str : " + str);
	}
}

public class Initializing {
	public static void main(String[] args) {
		Init obj = new Init();
		System.out.println("====================");
		obj.info();
	}
}
