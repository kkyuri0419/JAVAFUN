package series.fun.java.chap04.lec01;

/*
 * T,E,K,V
 * T = type
 * E = element
 * K = key
 * V = value
 * 
 * 사실상 의미는 없는데,암묵적으로 쓰이는 문자들이다.
 * 즉, 다른 문자를 써도 전혀 상관은 없지만,개발자 간에 암묵적인 약속이기에 이렇게 쓴다.
 */
class Cup<T>{
	T content;
	
	T getContent() {
		return this.content;
	}
	
	void setContent(T content) {
		this.content = content;
	}
}

public class _01_GenericIntro {
	public static void main(String[] args) {
		Cup<String> cupObj1 = new Cup<String>();
		cupObj1.setContent("coffee");
		System.out.println(cupObj1.getContent());
		/*
class Cup<String>{
	String content;
	
	String getContent() {
		return this.content;
	}
	
	void setContent(String content) {
		this.content = content;
	}
}
		 */
		Cup cupObj2 = new Cup();
		//Cup<Object> cupObj2 = new Cup<Object>();
		
	}
}
