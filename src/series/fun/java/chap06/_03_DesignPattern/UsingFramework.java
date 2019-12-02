package series.fun.java.chap06._03_DesignPattern;

//API
/* 안녕하세요~ 사람을 만드는 Frame입니다.
* 사용방법은 먼저 HumanFrame.makdNewPerson(String name, int tall, String gender)를 해주세요
* 단, 한사람밖에 생성을 할 수 없습니다.
* 만일 다른 사람으로 교체하고 싶으면 죽이세요...
* 죽이는 방법은 HumanFrame.killPerson()를 사용하시면 됩니다.
* 
* ***주요메서드***
* HumanFrame.makdNewPerson(String name, int tall, String gender)
* HumanFrame.killPerson()
*/

public class UsingFramework {
	public static void main(String[] args) {
		System.out.println(HumanFrame.makdNewPerson("신민지", 170, "여자"));
		System.out.println(HumanFrame.makdNewPerson("이민형", 181, "남자"));
		HumanFrame.killPerson();
		System.out.println(HumanFrame.makdNewPerson("이민형", 181, "남자"));
	}
}
