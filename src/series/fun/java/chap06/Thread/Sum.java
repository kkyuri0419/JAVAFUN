package series.fun.java.chap06.Thread;

public class Sum {
	private int num;
	
	Sum(){
		this.num = 0;
	}
	
	void addNum(int cnt) {
		num += cnt;
	}
	
	int getNum() {
		return this.num;
	}
}
