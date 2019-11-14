package series.fun.java.chap03.homework;

import java.util.Scanner;
/////////////////////////////////////////////////////////////////////////////////////////
class Gun{
	private int bullet;
//	Monster monster = new Monster();
	
	Gun(int bullet){
		this.bullet = bullet;
	}

	public boolean shot(Monster monster) { //monster를 받아서 쓸 수 있도록 인자로 설정
		boolean isDead = false;
		if (bullet > 0) {
			isDead = monster.hit();
			bullet -= 1;
		}else {
			System.out.println("reload needed");
		}// else
		return isDead;	}// shot()

	public void reload() {
		bullet += 5;
		System.out.println("5 more bullets reloaded");
	}// reload()
	
	public void checkBullet() {
		if (bullet > 0) {
			System.out.println(bullet + " bullets left");
		}else {
			System.out.println("No bullet left. Reload needed");
		}//else
	}// checkBullet()
}// class Gun()
/////////////////////////////////////////////////////////////////////////////////////////
class Monster{
	private int hp = 5000;
	
	//getter
	public int getHp() {
		return hp;
	}
	
	//true값을 반환하면 죽음을 의미함
	public boolean hit() {

		if(hp > 0) {
			System.out.println("꾸에엑");
			hp -= 500; //총알이 적중되면 hp가 500만큼 닳습니다.
			if(hp <= 0) {
				System.out.println("monter dead");
				return true; //총알 적중 후 만일 hp가 0 이하가 되면 몬스터는 죽습니다.
			}
			return false;
		}else {
			System.out.println("monster already dead");
			return true;
		}
	}
	
}
/////////////////////////////////////////////////////////////////////////////////////////
public class Exercise05 {
	
	public static void main(String[] args) {
		/*** Gun 클래스의 shot(), reload(), checkBullet()을 완성해서 몬스터를 죽여주세요! ***/
		/*** 이미 완성된 Monster 클래스의 hit()을 이용해주세요 ***/
		Gun gun = new Gun(5);
		Scanner sc = new Scanner(System.in);
		Monster monster = new Monster(); // 여기서 몬스터 한번만 생성
		boolean isMonsterDead = false;
		int select = 0;
		
		while(!isMonsterDead) {
			System.out.println("==========================");
			System.out.println("현재 몬스터 체력 : " + monster.getHp());
			System.out.println("[1]총쏘기");
			System.out.println("[2]재장전");
			System.out.println("[3]총알갯수확인");
			System.out.println("==========================");
			System.out.print("행동 선택 : ");
			select = sc.nextInt();
			
			switch(select) {
			case 1:
				isMonsterDead = gun.shot(monster); //인자로 생성되었던 몬스터를 넣어
				break;
			case 2:
				gun.reload();
				break;
			case 3:
				gun.checkBullet();
				break;
			default:
				System.out.println("1,2,3중에 입력해주세요.");
				break;
			}//switch문
		}//while문
		
		System.out.println("Game Over");
	}
}
