package series.fun.java.chap03.homework;
/////////////////////////////////////////////////////////////////////////////////////////
class Calc{
	
	int num1;
	int num2;
	
	Calc(int num1, int num2){
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public String getString() {
		return "This is calculator";
	}
	
	public int add() {
		return 0;
	}
	
	public int sub() {
		return 0;
	}
	
	public int mul() {
		return 0;
	}
	
	public double div() {
		return 0;
	}
}
/////////////////////////////////////////////////////////////////////////////////////////
public class Exercise02 {
	public static void main(String[] args) {
		
		Calc calc = new Calc(10, 20);
		/* 문제1. 아래 메서드들의 반환 값을 console창에 출력할 수 있게 하세요.*/
		calc.getString();
		calc.add(); /*문제2. 두 수를 더한 값이 나오게 하세요.*/
		calc.sub(); /*문제3. 두 수를 뺀 값이 나오게 하세요.*/
		calc.mul(); /*문제4. 두 수를 곱한 값이 나오게 하세요.*/
		calc.div(); /*문제5. 두 수를 나눈 후 몫 값이 나오게 하세요.*/
	}
}