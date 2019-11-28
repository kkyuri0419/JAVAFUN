package series.fun.java.chap04.lec03;

enum Eatable{
	//default로 1,2,3이 주어짐.
	COOKIE, CAKE, APPLE;
}

enum Game{
//	default로 1,2 주어짐.
	MARINE, TANK;
}


public class _02_EnumBasic {
	public static void main(String[] args) {
		System.out.println(Eatable.COOKIE.equals(Game.MARINE));
	}

}
