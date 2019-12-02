package series.fun.java.chap04.lec05;

class A{
	int age;
	int score;
	
	A(int age, int score){
		this.age = age;
		this.score = score;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return ((A)obj).score == this.score && ((A)obj).age == this.age;
	}
	
	
}

public class _01_Class_Compare {
	public static void main(String[] args) {
		A a1 = new A(25,70);
		A a2 = new A(27,70);
		
		System.out.println(a1.equals(a2));
	}
}
