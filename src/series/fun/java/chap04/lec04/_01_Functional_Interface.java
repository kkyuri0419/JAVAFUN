package series.fun.java.chap04.lec04;



public class _01_Functional_Interface {
	public static void main(String[] args) {
		System.out.println(new MyFunc(){

			@Override
			public int calculator(int x, int y) {
				// TODO Auto-generated method stub
				return x + y;
			}
			
		}.calculator(1, 2));
	}

}
