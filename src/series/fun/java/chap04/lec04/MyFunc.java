package series.fun.java.chap04.lec04;

@FunctionalInterface //람다는 메소드가 1개여야 쓸 수 있기 때문에 annotation을 쓰면 컴파일 단계에서 오류를 잡아낼 수 있다.
interface MyFunc{
	int calculator(int x, int y);
}
