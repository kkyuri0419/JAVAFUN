package series.fun.java.chap03.lec02;

class Robot{
	
	private String name;
	private boolean isOperated;
	private boolean isEnemy;
	
	Robot(String name, boolean b1, boolean b2){
		this.name  = name;
		this.isOperated = b1;
		this.isEnemy = b2;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isOperated() {
		return isOperated;
	}
	public void setOperated(boolean isOperated) {
		this.isOperated = isOperated;
	}
	public boolean isEnemy() {
		return isEnemy;
	}
	public void setEnemy(boolean isEnemy) {
		this.isEnemy = isEnemy;
	}
	
	public void getInfo() {
		System.out.println("로봇이름 : " + this.getName());
		System.out.println((this.isEnemy())? "애는 적군임" : "애는 아군임");
		System.out.println((this.isOperated())? "동작중" : "죽음");
	}
	
}

public class ClassInfoMethod {
	public static void main(String[] args) {
		Robot irobot = new Robot("i로봇", true, false);
		irobot.getInfo();
	}
}
