package series.fun.java.chap03.lec03;

@FunctionalInterface
interface Calculator{
	void cal(int num1, int num2);
}

public class AAA {
	public static void main(String[] args) {

		new Calculator() {
			@Override
			public void cal(int num1, int num2) {
				System.out.println(num1-num2);
			}
		}.cal(20, 1);


		Calculator cal = (num1, num2) -> System.out.println(num1-num2);
		cal.cal(20, 1);



	}
}
