package series.fun.java.chap03.lec03;

import series.fun.java.chap03.lec03.OuterClass.StaInnerClass;

class OuterClass{
	
	String insStr = "인스턴스 변수";
	static String staStr = "클래스 변수";
	
	void instanceMethod() {
		System.out.println("인스턴스 메서드");
	}
	
	static void staticMethod() { 
		System.out.println("클래스 메서드");
	}
	
	/*** 인스턴스형 내부클래스 ***/
	class InsInnerClass{
		String innerinsStr = "인스턴스 변수";
//		static String innterStaStr = "클래스 변수"; //Error
		
		void innerInstanceMethod() {
			System.out.println("인스턴스 메서드");
		}
		
//		static void innerStaticMethod() { //Error
//			System.out.println("클래스 메서드");
//		}
		
		void forUseOuter() {
			System.out.println(insStr);
			System.out.println(staStr);
			instanceMethod();
			staticMethod();
		}
	}
	
	/*** 클래스형 내부클래스 ***/
	static class StaInnerClass{
		String staInnerinsStr = "인스턴스 변수";
		static String staInnterStaStr = "클래스 변수"; 
		
		void staInnerInstanceMethod() {
			System.out.println("인스턴스 메서드");
		}
		
		static void staInnerStaticMethod() {
			System.out.println("클래스 메서드");
		}
		
		void staForUseOuter() {
//			System.out.println(insStr); //Error
			System.out.println(staStr);
//			instanceMethod(); //Error
			staticMethod();
		}
		
		static void staForUseOuter2() {
//			System.out.println(insStr); //Error
			System.out.println(staStr);
//			instanceMethod(); //Error
			staticMethod();
		}
	}
}

public class InnerClassEx {
	public static void main(String[] args) {
		OuterClass outer = new OuterClass();
//		outer1.innerInstanceMethod(); //Error
		/*
		 * 내부클래스를 쓸 수 없는 것을 볼 수 있다.
		 * OuterClass만 불렀지 InnerClass를 부르지 않았다.
		 */
		OuterClass.InsInnerClass inner1 = outer.new InsInnerClass();
		OuterClass.StaInnerClass inner2 = new OuterClass.StaInnerClass();
		
		inner1.innerInstanceMethod();
//		inner1..staInnerInstanceMethod(); //Error
		/*
		 * StaInnerClass의 정보를 쓸 수 없다.
		 */
		
		inner2.staInnerInstanceMethod();
//		inner2.innerInstanceMethod(); //Error
		/*
		 * InsInnerClass의 정보를 쓸 수 없다.
		 */
	}
}
