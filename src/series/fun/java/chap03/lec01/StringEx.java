package series.fun.java.chap03.lec01;

import java.util.Arrays;
import java.util.StringJoiner;

class Dog{}

public class StringEx {
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Hello";

		Dog d1 = new Dog();
		Dog d2 = new Dog();

		System.out.println(s1==s2); //true
		System.out.println(d1==d2); //false
		/*
		 * Dog는 주소값이 다르기 때문에 같다고 하지 않는다. 
		 * 그러나 위와 같은 String 선언방식으로 인해
		 * 주소 값이 같기 때문에 true가 반환된다.
		 */

		String s3 = new String("Hello");
		String s4 = new String("Hello");

		System.out.println(s3==s4); //false
		/*
		 * 위와 같은 String 선언 방식으로 인해
		 * Hello라는 값이 같더라도 다른 객체를 생성한다.
		 * 그러므로 주소 값이 틀려지므로 false를 반환한다.
		 */

		System.out.println(s1.equals(s3)); //true
		/*
		 * 그러므로 String의 값을 비교할 때는 "=="연산자 보다는
		 * String 클래스의 메서드 중 하나인 equals()라는
		 * 기능을 쓰는 것이 바람직하다.
		 */

		//String을 null이나 ""로 초기화하는 차이점
		String initStr1 = null;
		String initStr2 = "";
		System.out.println("null로 초기화 : " + initStr1);
		System.out.println("\"\"로 초기화  : "+ initStr2);

		String something = "";
		if(something == null || something=="") {
			System.out.println("String은 아무 값이 없다.");
		}else {
			System.out.println("String은 값이 있다");
		}

		//join() : 여러 문자열 사이에 구분자를 넣어서 결합
		String countries = "Korea-China-Japan";
		String[] arr = countries.split("-");
		System.out.println(Arrays.deepToString(arr));
		String reJoin = String.join("@",arr); //각 배열 요소를 @로 구분해서 결합
		System.out.println(reJoin);

		//StringJoiner
		StringJoiner strJoiner = new StringJoiner(",","((","))");
		String[] strArr = new String[] {"R","O","B"};
		for(String str : strArr) {
			strJoiner.add(str);
		}
		System.out.println(strJoiner.toString());

		//String.format() --> System.out.printf()와 사용법이 같다.
		String strForm = String.format("%d번찍어 안 넘어가는 %s없다.",10,"Java");
		System.out.println(strForm);
	}
}
/*
 * [문자]
 * String클래스 --> char배열
 * char[] charArr = str.toCharArray()
 * 
 * char배열 --> String클래스
 * String str = new String(charArr)
 */