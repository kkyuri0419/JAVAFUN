package series.fun.java.chap03.homework;
import java.util.Scanner;

class Member{
	private String username;
	private String password;

	Member(String username, String password){
		this.username = username;
		this.password = password;
	}

	//Getter username
	public String getUsername(){
		return username;
	}

	//Getter password
	public String getPassword(){
		return password;
	}

	//Setter password
	public void setPassword(String newpassword){
		this.password = newpassword;
	}
}// Member class

public class Exercise04{

	public static int inputData(Scanner keyboard){
		System.out.print("입력 : ");
		return keyboard.nextInt();
	}

	public static void mainMenu(){
		System.out.println("------원하는 서비스를 선택해주세요-----");
		System.out.println("(1) 로그인");
		System.out.println("(2) 회원가입");
		System.out.println("(3) 종료");
		System.out.println("---------------------------------");
	}

	public static int menuController(Scanner keyboard){
		switch(inputData(keyboard)){
			case 1://로그인
				return 1;
			case 2://회원가입
				return 2;
			case 3://종료
				 return 3;
			default:
				System.out.println("잘못 입력하셧습니다.");
				return 9;
		}
	}

	public static void logIn(Member[] memberDB, Scanner keyboard){
		System.out.println("아이디를 입력하세요 : ");
		keyboard.nextLine();
		String id = keyboard.nextLine();
		System.out.println("비밀번호를 입력하세요 : ");
		String ps = keyboard.nextLine();
		boolean isEqual = false;
		for (int i=0; i < memberDB.length; i++) {
			if (memberDB[i]!=null&&memberDB[i].getUsername().equals(id)) {
				System.out.println("ssss1");
				if (memberDB[i].getPassword().equals(ps)) {
					isEqual = true;
				}

			}
			
		}//for
		if (isEqual) {
			System.out.println("로그인 성공!");
		}else {
			System.out.println("로그인 실패");
		}
	
	}

	public static String SignUpID(Scanner keyboard){
		System.out.println("------회원가입 페이지 입니다.------");
		System.out.print("사용할 아이디를 입력해 주세요 : ");
		keyboard.nextLine();
		return keyboard.nextLine();
	}

	public static String firstPW(Scanner keyboard){
		System.out.println("사용할 비밀번호를 입력해 주세요 : ");
		return keyboard.nextLine();
	}
	public static String secondPW(Scanner keyboard){
		System.out.println("비밀번호를 한번 더 입력해 주세요 : ");
		return keyboard.nextLine();
	}

	public static void signUp(int memNum, Member[] memberDB, Scanner keyboard){
		if (memNum > 9){
			System.out.println("더 이상 새로운 가입이 불가능 합니다.");
		}else{
			String iD = SignUpID(keyboard);
			String firstpw = firstPW(keyboard);
			String secondpw = secondPW(keyboard);
			while(!(firstpw.equals(secondpw))){
				System.out.println("확인 비밀번호가 일치하지 않습니다.");
				System.out.println("다시 입력해 주세요.");
				firstpw = firstPW(keyboard);
				secondpw = secondPW(keyboard);
			}
		Member member = new Member(iD,secondpw);
		memberDB[memNum] = member;
		}
	}


	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		boolean isTerminate = false;
		/*문제 2. 다음 프로그램은 회원을 총 10명만 받을 수 있는 프로그램입니다.
		 * (1)로그인, (2)회원가입, (3)종료
		 * 위 항목들을 구현해주세요.
		 * 	(1)로그인이 성공했을 때 "로그인 성공" 혹은 "로그인 실패"만 나오면 됩니다. 
		 *     (2)회원가입은 아이디, 비밀번호, 비밀번호 확인을 입력받고 성공하면 memberDB에 저장시키면 됩니다. 단 10명이 넘기면 안되게 하세요.
		 *     (3)종료는 while문이 종료되어야 합니다.
		 */
		int memNum = 0;//멤버 수
		Member[] memberDB = new Member[10]; //회원정보
		
		while(!isTerminate) {
			mainMenu();
			int service = menuController(keyboard);
			switch(service){
				case 1: 
					/*System.out.println("아이디를 입력하세요 : ");
					keyboard.nextLine();
					String id = keyboard.nextLine();
					System.out.println("비밀번호를 입력하세요 : ");
					String ps = keyboard.nextLine();
					boolean isEqual = false;
					for (int i=0; i < memberDB.length; i++) {
						if (memberDB[i]!=null&&memberDB[i].getUsername().equals(id)) {
							System.out.println("ssss1");
							if (memberDB[i].getPassword().equals(ps)) {
								isEqual = true;
							}
			
						}
						
					}//for
					if (isEqual) {
						System.out.println("로그인 성공!");
					}else {
						System.out.println("로그인 실");
					}*/
				
					logIn(memberDB,keyboard);
					break;
				case 2:
					signUp(memNum,memberDB,keyboard);
					memNum += 1;
					break;
				case 3:
					isTerminate = true;
					break;
				default:
					System.out.println("1,2,3중에 입력해주세요.");
					break;


			}//swich문
			
		}//while문
		System.out.println("종료!");
		
	}//main()
	
}//Exercise04.class