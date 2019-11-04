package series.fun.java.chap03.lec05;

public class MathEx {
	/* Math의 주요 메서드
	 * 
	 * ceil() : 올림
	 * floor() : 버림
	 * round() : 반올림 ( int or long return )
	 * rint() : 반올림 ( double return )
	 * 
	 * sqrt() : 제곱근 계산
	 * pow() : 제곱 계산
	 * 
	 * abs() : 절대값
	 * max() : 두 값 중 큰 수
	 * min() : 두 값 중 작은 수
	 * 
	 * random() : 랜덤
	 * 
	 * Math 클래스의 메서드들의 내부를 자세히 보면 StrictMath클래스로 되어 있는 것이 있다.
	 * Math클래스는 JVM이 설치된 OS의 메서드를 호출해서 사용하여 OS에 의존적이어서 처리방법이 OS마다 다를 때 결과가 달라졌다.
	 * 그러나 성능보단 JVM의 특징을 살리기위해 새로 작성된 것이 OS탈의존적인 StrictMath클래스라고 볼 수 있다.
	 * 
	 * [TIP]
	 * 큰 수를 다룰 때 long형이나 double형의 리터럴을 벗어나는 경우가 생길수도 있다.
	 * 그땐 BigInteger클래스와 BigDecimal클래스를 이용하도록 하자 
	 */
	
	public static void main(String[] args) {
		Class math = Math.class;
	}
}
