package series.fun.java.chap04.lec04;

public class _02_Lambda {
	public static void main(String[] args) {
		//원형
		/*
		MyFunc myfunc = new MyFunc(){
			@Override
			public int calculator(int x, int y) {
				// TODO Auto-generated method stub
				return x + y;
			}
	
		};
		*/
		
		
		
		/***1.클래스 이름을 지운다.***/
		/*
		MyFunc myfunc = 
			@Override
			public int calculator(int x, int y) {
				// TODO Auto-generated method stub
				return x + y;

		};
		*/
		
		
		/***2.메서드 이름을 지운다. 그리고 ->을 추가한다***/
		/*
		MyFunc myfunc = (int x, int y) -> {return x + y;};
		*/
		
		
		/***3.return을 지운다. return을 지우ㅜ면 블럭도 지워야 한다.***/
		/*
		MyFunc myfunc = (int x, int y) -> x + y;
		*/
		
		
		/***4.자료형을 지운다. 자료형을 명시적으로 쓰고 싶다면 둘 다 모두 써야 한다(int x, y)로하면 안됌.***/
		/*
		MyFunc myfunc = (x, y) -> x + y;
		*/

		MyFunc myfunc = (x, y) -> x + y;
		
		int num = myfunc.calculator(10, 20);
		System.out.println(num);
		
		
		MyFunc f = (x, y) -> x * y + 10;
	}

}
