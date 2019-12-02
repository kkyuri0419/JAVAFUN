package series.fun.java.chap06._01_Thread;

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
