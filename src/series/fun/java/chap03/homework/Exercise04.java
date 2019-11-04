package series.fun.java.chap03.homework;

/*** 문제 1. Example 클래스를 참고해서 username과 password를 가지고 있는 Member 클래스를 만드세요. ***/
class Example{
	private String a;
	private String b;
	
	Example(String a, String b){
		this.a = a;
		this.b = b;
	}
	
	public String getA() {
		return a;
	}
	public void setA(String a) {
		this.a = a;
	}
	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}
}
/////////////////////////////////////////////////////////////////////////////////////////
class Member{
	
}
/////////////////////////////////////////////////////////////////////////////////////////
public class Exercise04 {
	public static void main(String[] args) {
		/*문제 2. 다음 프로그램은 회원을 총 10명만 받을 수 있는 프로그램입니다.
		 * (1)로그인, (2)회원가입, (3)종료
		 * 위 항목들을 구현해주세요.
		 * 	(1)로그인이 성공했을 때 "로그인 성공" 혹은 "로그인 실패"만 나오면 됩니다. 
		 *     (2)회원가입은 아이디, 비밀번호, 비밀번호 확인을 입력받고 성공하면 memberDB에 저장시키면 됩니다. 단 10명이 넘기면 안되게 하세요.
		 *     (3)종료는 while문이 종료되어야 합니다.
		 */
		Member[] memberDB = new Member[10]; //회원정보
		
		while(true) {
			
		}//while문
		
	}//main()
	
}//Exercise04.class
