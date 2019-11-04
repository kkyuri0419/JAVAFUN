package series.fun.java.chap03.lec01;

class Cat{
	
	String name;
	
	Cat(){
		System.out.println("생성자1 호출");
	}
	
	Cat(String name){
		this.name = name;
		System.out.println("생성자2 호출");
	}
	
}

public class OverloadingEx {
	
	public static void doSomething() {
		System.out.println("아무것도 안하는 doSomething()");
	}
	
	protected String doSomething(String str) {
		System.out.println("str : " + str);
		return str;
	}
	
	public static void doSomething(int num, String str) {
		System.out.println("num : " + num);
		System.out.println("str : " + str);
	}
	
	public static void main(String[] args) {
		doSomething(123, "ㅎㅇㅎㅇ");
		
		Cat c1 = new Cat();
		Cat c2 = new Cat("뽀삐");
	}
}
