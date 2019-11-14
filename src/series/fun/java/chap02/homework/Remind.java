package series.fun.java.chap02.homework;
import java.util.Arrays;

public class Remind {
	/* 01. 변수
	 * System.out의 print( ), printf( ), println( )을 이용해서
	 * 자료형 int, long, String을 가진 변수를 출력해보기 
	 */
	
	/* ******************************************************* /
	public static void main(String[] args) {
		int integer = 1;
		long lon = 213L;
		String str = "dd";
		System.out.println(integer);
		System.out.print(lon);
		System.out.printf("%s", str);
	}
	/******************************************************* */
	
	/* 02. 연산자
	 * Scanner를 이용해서 두 변수를 입력받아서 덧셈, 나눗셈, 곱하기, 나누기를 구현해보기
	 */
	/* ******************************************************* /
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("num1을 입력하세요: ");
		int num1 = keyboard.nextInt();
		System.out.println("num2을 입력하세요: ");
		int num2 = keyboard.nextInt();
		
		System.out.println("num1 + num2 = "+ (num1 + num2));
		System.out.println("num1 - num2 = "+ (num1 - num2));
		System.out.println("num1 X num2 = "+ (num1 * num2));
		System.out.println("num1 / num2 = "+ (num1 / num2));
		
		

	}
	/******************************************************* */
	/* 03. 조건문
	 * 점수를 입력받아서 점수별로 학점을 출력하기
	 * 91점~ : A
	 * 81~90점 : B
	 * 71~80점 : C
	 * 61~70점 : D
	 * ~60점 : F
	 */
	/* ******************************************************* /
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("점수를 입력하세요: ");
		int score = keyboard.nextInt();
		if (score > 90 && score <=100) {
			System.out.println("A");
		}else if(score > 80 && score <= 90) {
			System.out.println("B");
		}else if(score > 70 && score <= 80) {
			System.out.println("B");
		}else if(score > 60 && score <= 70) {
			System.out.println("B");
		}else if (score >= 0 && score <= 60) {
			System.out.println("F");
		}else {
			System.out.println("점수를 잘못입력하셨습니다");
		}
	}
	/********************************************************/
	/* 04. 반복문
	 * 반복문을 활용해서 구구단을 출력해보세요
	 */
	/* ******************************************************* /
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " x " + j + " = " + (i*j));
			}
		}

	}
	/********************************************************/
	/* 05. 배열
	 * 배열 [5,1,6,10,9,2]를 오름차순으로 정렬해보세요
	 */
	/********************************************************/
	public static void main(String[] args) {
		int[] iArr = {5,1,6,10,9,2};
		
		for(int i = 0; i < iArr.length; i++) {
			for (int j = i+1; j < iArr.length; j++) {
				if (iArr[i] > iArr[j]) {
					int bigger = iArr[i];
					iArr[i] = iArr[j];
					iArr[j] = bigger;
				}//if
			}//for
		}//for
		System.out.print("[");
		for (int i = 0; i <iArr.length; i++) {
			if(i==iArr.length-1) {
				System.out.print(iArr[i]);
				break;
			}
			System.out.print(iArr[i] + ", ");
		}
		System.out.println("]");
		
		System.out.println(Arrays.toString(iArr));
	}

	/********************************************************/
	/* 06. 함수
	 * 랜덤으로 num1과 num2 사이의 정수를 반환하는 returnRandomNumber( )를 구현하세요
	 */
	/* ******************************************************* /
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("최소을 입력해 주세요: ");
		int min = keyboard.nextInt();
		System.out.println("최대을 입력해 주세요: ");
		int max = keyboard.nextInt();
		
		int randomValue = (int) (Math.random()*max + min);
		System.out.println(randomValue);
		
		//import java.util.Random;
		//Random random = new Random();
		//random.nextInt(최대값) #최대값-1이 최대값이 됨.
		
		//Java.util.Math;
		//Math.random(); #double형
		//(int)(Math,random()*최대값+최소값) #최대값,최소값 지정하는 법.
		
	}
	/********************************************************/

}