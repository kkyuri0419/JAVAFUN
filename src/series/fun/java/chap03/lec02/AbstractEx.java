package series.fun.java.chap03.lec02;

abstract class Factory{
	private String name; //공장 이름
	private String location; //공장 위치
	private String product; //생산 제품
	private int equipment_num; //설비 갯수
	private boolean isOperated = false; //공장 가동 여부
	
	Factory(String name, String location, String product, int equipment_num){
		this.name = name;
		this.location = location;
		this.product = product;
		this.equipment_num = equipment_num;
	}
	
	protected void start() {
		this.isOperated = true;
	}
	
	protected void stop() {
		this.isOperated = false;
	}
	
	protected boolean isStart() {
		return this.isOperated;
	}
	
	//추상메서드
	protected abstract void state();
}

class SnackFactory extends Factory{
	
	SnackFactory(String name, String location, String product, int equipment_num) {
		super(name, location, product, equipment_num);
	}

	@Override
	protected void state() {
		if(isStart()) {
			System.out.println("과자 생산 중");
		}else {
			System.out.println("과자 생산이 중단됨");
		}
	}
	
	/*
	 * 추상클래스에서 상속받은 속성 및 기능뿐만아니라
	 * 새롭게 선언이 가능하다.
	 */
	public void factoryInfo() {
		System.out.println("과자 공장입니다.");
//		System.out.println(name); //Error
		
		/*
		private String name; //공장 이름
		private String location; //공장 위치
		private String product; //생산 제품
		private int equipment_num; //설비 갯수
		private boolean isOperated = false; //공장 가동 여부
		
		접근제한자로 인해 은닉이 되었기 때문에 사용이 불가능하다.
		바람직했던 방법은 구현클래스에서 이 메서드를 만드는 것이 아니라
		추상클래스에서 미리 만들어 놓는 것일 것이다.
		*/	
	}
	
}

//추상클래스
public class AbstractEx {
	public static void main(String[] args) {
//		Factory absObj = new Factory("과자 공장", "서울", "과자", 10); //Error
		/*
		 * 추상클래스는 인스턴스화가 불가능하다.
		 * Cannot instantiate the type Factory
		 */
		SnackFactory factory = new SnackFactory("과자 공장", "서울", "과자", 10);
		factory.state();
		factory.start();
		factory.state();
		factory.stop();
		factory.state();
		factory.factoryInfo();
	}
}
