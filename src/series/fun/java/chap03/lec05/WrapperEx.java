package series.fun.java.chap03.lec05;

class IntClass{
	
	int num;
	
	IntClass(int num){
		this.num = num;
	}

	@Override
	public String toString() {
		return Integer.toString(num);
	}
	
}

public class WrapperEx {
	
	public static void changeNum(int num) {
		num = 20;
	}
	
	public static void changeNum(Integer intObj) {
		intObj = 20;
	}
	
	public static void changeNum(IntClass intObj) {
		intObj.num = 20;
	}
	
	public static void main(String[] args) {
		//Primitive Type
		int num = 10;
		changeNum(num);
		System.out.println("int num의 changeNum( )결과 : " + num); //call by value
		
		//Reference Type
		IntClass intObj = new IntClass(num);
		changeNum(intObj);
		System.out.println("IntClass intObj의 changeNum( )결과 : " + intObj); //call by reference
		
		//Wrapper Class
		Integer intWrap = new Integer(num);
		changeNum(intWrap);
		System.out.println("IntClass intObj의 changeNum( )결과 : " + intWrap); //??? 이럴수가... 변화가 없다. 왜지?
		/*
		 * 왜냐 하면, Integer은 immutable이기 때문이다.
		 * Immutable이란 
		 * immutable은 한번 객체가 생성되거나 초기화되면 더 이상 상태를 변경하는 것이 불가능한 것을 말한다.
		 */
	}
}
