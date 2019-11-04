package series.fun.java.chap03.lec01;


class Member{
	//캡슐화 : 회원정보와 관련된 속성을 정의하였다.
	//접근제한자 : 정보 은닉으로 제어성을 높였다.
	private String username;
	private String password;

	//캡슐화 : 그리고 속성들을 제어할 Method들을 정의하였다. (getter/setter)
	Member(String username, String password){
		this.username = username;
		this.password = password;
	}

	//ID는 한번 정해지면 바뀌질 않으므로 setter가 빠져있다.
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}

public class Encapsulation {	
	public static void main(String[] args) {
		Member mem =new Member("JavaKing","1234");
	}
}
