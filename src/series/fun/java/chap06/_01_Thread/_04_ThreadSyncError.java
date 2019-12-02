package series.fun.java.chap06._01_Thread;

class Increment{
	int num = 0;
	
	public synchronized void increment() {
		num++;
	}
	
	public int getNum() {
		return this.num;
	}
}

class IncThread extends Thread{
	Increment inc;
	
	IncThread(Increment inc){
		this.inc = inc;
	}

	@Override
	public void run() {
		for(int i = 0; i < 10000; i++) {
			inc.increment();
		}
	}	
}

public class _04_ThreadSyncError {
	public static void main(String[] args) {
		Increment inc = new Increment();
		IncThread it1 = new IncThread(inc);
		IncThread it2 = new IncThread(inc);
		IncThread it3 = new IncThread(inc);
		IncThread it4 = new IncThread(inc);
		
		it1.start();
		it2.start();
		it3.start();
		it4.start();
		
		try {
			it1.join();
			it2.join();
			it3.join();
			it4.join();
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println(inc.getNum());
	}
	

}
