package series.fun.java.chap04.lec03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

interface Commander{
	String ONE ="1", TWO="2", THREE="3", FOUR="4", QUIT="/quit";
}

public class _01_Intro {
	
	public static void main(String[] args) throws IOException {

		boolean isQuit = false;
		
		while(true) {
			String msg = new BufferedReader(new InputStreamReader(System.in)).readLine();

			switch(msg) {
			case Commander.ONE:
				System.out.println("1 : Commander.ONE");
				break;
			case Commander.TWO:
				System.out.println("2 : Commander.TWO");
				break;
			case Commander.THREE:
				System.out.println("3 : Commander.THREE");
				break;
			case Commander.FOUR:
				System.out.println("4 : Commander.FOUR");
				break;
			case Commander.QUIT:
				isQuit = true;
				break;
			default:
				System.out.println("1~4 사이만 입력해 주세요");
				System.out.println("종료하시려면 /quit를 입력하세요");
			}
			
			if(isQuit) {
				System.out.println("종료");
				break;
			}
		}



	}
}
