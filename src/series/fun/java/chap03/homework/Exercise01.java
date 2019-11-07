package series.fun.java.chap03.homework;
/////////////////////////////////////////////////////////////////////////////////////////
class Dog{
	
	String color;
	
	Dog(String color){
		/*문제 1. 무엇을 써야 color를 초기화할 수 있을까요?*/
		this.color = color;
	}
	
	public void printInfo() {
		System.out.println("이 강아지는 " + color + "색 강아지입니다.");
	}
	
}
/////////////////////////////////////////////////////////////////////////////////////////
public class Exercise01 {
	
	public static void main(String[] args) {
		/*문제 2. 검은색 강아지와 하얀색 강아지를 생성해보세요*/
		Dog example = new Dog("갈색");
		example.printInfo();

		Dog whitepuppy = new Dog("하얀색");
		whitepuppy.printInfo();

		Dog blackpuppy = new Dog("검은색");
		 blackpuppy.printInfo();
	}
	
}
