package series.fun.java.chap04.lec03;

enum Direction{
	EAST(6, ">"), WEST(4, "<"), SOUTH(2,"v"), NORTH(8,"^");
	
	private final int num;
	private String symbol;

	Direction(int num ,String symbol){
		this.num = num;
		this.symbol = symbol;
	}
	
	public int getNum() {
		return num;
	}
	public String getSymbol() {
		return symbol;
	}
}

public class _05_EnumDefinition {
	public static void main(String[] args) {
		Direction[] dArr = Direction.values();
		
		for(Direction d : dArr) {
			System.out.println(d.name() + " : " + d.getNum() + " : "+d.getSymbol());
		}
	}
}
