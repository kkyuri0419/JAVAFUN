package series.fun.java.chap04.lec03;


enum Transportation{
	BUS(100){
		@Override
		int total(int hour) {
			return hour*BASIC_CHARGE;
		}
	}, TRAIN(150){
		@Override
		int total(int hour) {
			return hour*BASIC_CHARGE;
		}
	}, SHIP(200){
		@Override
		int total(int hour) {
			return hour*BASIC_CHARGE;
		}
	}, AIRPLAIN(300){
		@Override
		int total(int hour) {
			return hour*BASIC_CHARGE;
		}
	};
	
	protected final int BASIC_CHARGE;
	
	Transportation(int basic_charge){
		this.BASIC_CHARGE = basic_charge;
	}
	
	abstract int total(int hour);
	
	public int getBasicCharge() {
		return BASIC_CHARGE;
	}
}

public class _06_EnumAbstract {
	
	public static void main(String[] args) {
		
		Transportation[] tArr = Transportation.values();
		
		for(Transportation t : tArr) {
			System.out.println(t.name() + " 기본요금 : $" + t.getBasicCharge());
		}
		//refactoring : ctrl+shift+r
		System.out.println("bus fare="+Transportation.BUS.total(100));
		System.out.println("train fare="+Transportation.TRAIN.total(100));
		System.out.println("ship fare="+Transportation.SHIP.total(100));
		System.out.println("airplain fare="+Transportation.AIRPLAIN.total(100));
	}
}
