package series.fun.java.chap03.homework;
/////////////////////////////////////////////////////////////////////////////////////////
class Animal{
	private String animalName;

	//Getter
	public String getAnimalName(){
		return animalName;
	}

	//Setter
	public void  setAnimalName(String newAnimalName){
		this.animalName = newAnimalName;
	}
	
	public void move() {
		System.out.println("움직입니다.");
	}
}
/////////////////////////////////////////////////////////////////////////////////////////
class Wolf extends Animal{

	@Override
	public void move() {
		System.out.println( getAnimalName() + "가 움직입니다.");
	}
	
}
/////////////////////////////////////////////////////////////////////////////////////////
public class Exercise03 {
	/*
	 * 문제1. Wolf가 Animal을 상속하게 하세요
	 * 문제2. Wolf 인스턴스를 생성하세요.
	 * 문제3. animalName의 값을 "랑이"로 바꾸세요. 단,  private String animalName는 바꿀 수 없습니다.
	 * 문제4. Wolf 인스턴스가 move()를 출력할 때 "랑이가 움직입니다."로 나올 수 있게 오버라이딩하세요. 
	 * 			단, animalName에 따라 move()의 출력문이 바뀌어야 합니다. (ex. "유리가 움직입니다.")
	 * 문제5. animalName의 값을 "리더"로 바꿔서 결과가 "리더가 움직입니다."라고 나오는지 확인하세요.
	 */
	public static void main(String[] args) {

		Wolf wolf = new Wolf();
		wolf.setAnimalName("랑이");
		wolf.move();
		wolf.setAnimalName("리더");
		wolf.move();
		
	} 
}
