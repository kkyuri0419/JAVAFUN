package series.fun.java.chap06._03_DesignPattern;

class HumanFrame{
	private String name;
	private int tall;
	private String gender;
	
	private boolean isHeadExist = false;
	private boolean isArmsExist = false;
	private boolean isLegsExist = false;
	
	private boolean isSet = false;
	private static boolean isFirst = true;
	
	private static HumanFrame theOnlyOne;
	
	public static HumanFrame makdNewPerson(String name, int tall, String gender) {
		if(isFirst) {
			isFirst = false;
			theOnlyOne = new HumanFrame(name, tall, gender, true);
			return theOnlyOne;
		}else {
			return theOnlyOne;
		}
	}
	
	private HumanFrame(String name, int tall, String gender, boolean doYouWantToSeeInfo) {
		setPerson(name, tall, gender);
		makeHead();
		makeArms();
		makeLegs();
		if(doYouWantToSeeInfo) {
			getPersonInfo();
		}
	}
	
	private void makeHead() {
		this.isHeadExist = true;
	}
	
	private void makeArms() {
		this.isArmsExist = true;
	}
	
	private void makeLegs() {
		this.isLegsExist = true;
	}
	
	private void setPerson(String name, int tall, String gender) {
		this.name = name;
		this.tall = tall;
		this.gender = gender;
		isSet=true;
	}
	
	private void getPersonInfo() {
		if(isHeadExist&&isArmsExist&&isLegsExist) {
			if(isSet) {
				System.out.println("이름 : " + name);
				System.out.println("키 : " + tall + "cm");
				System.out.println("성별 : " + gender);
			}else {
				System.out.println("정체성이 없습니다.");
			}
		}else {
			System.out.println("사람구실을 못합니다.");
		}
	}
	
	
	public static void killPerson() {
		theOnlyOne = null;
		isFirst = true;
	}
}