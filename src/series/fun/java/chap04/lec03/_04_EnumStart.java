package series.fun.java.chap04.lec03;

//JAVA 1.5에 추가됨

enum Number{
	ONE, TWO, THREE, FOUR
}

enum Starcraft{
	MARINE, GHOST, SCV
}

public class _04_EnumStart {
	public static void main(String[] args) {
		System.out.println(Number.ONE==Number.ONE);
		System.out.println(Number.ONE==Number.TWO);
		
//		System.out.println(Number.ONE == Starcraft.MARINE); 비교 못함
		
		Number[] nArr = Number.values(); //enum Number
		
		for(Number n : nArr) {
			System.out.println(n.name() + " : " +n.ordinal());
		}
		
		Starcraft[] sArr = Starcraft.values();
		
		for(Starcraft s : sArr) {
			System.out.println(s.name() + " : " +s.ordinal());
		}
	}
}
