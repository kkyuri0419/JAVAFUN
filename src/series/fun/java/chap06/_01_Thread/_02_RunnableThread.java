package series.fun.java.chap06._01_Thread;

class AddThread extends Sum implements Runnable{
	
	int start,end;
	
	AddThread(int start, int end){
		this.start = start;
		this.end = end;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub\
		for (int i = start; i <= end; i++) {
			System.out.println(i + "값 누적");
			addNum(i); // Sum에서 상속 받음.
		}
	}
	
}

public class _02_RunnableThread {
	public static void main(String[] args) {
		System.out.println("main thread start");
		AddThread at1 = new AddThread(1,50);
		AddThread at2 = new AddThread(51,100);
		Thread t1 = new Thread(at1);// Runnable에는 start메서드가 없기 때문에 thread로 감싸줘서 thread객체롤 바꾼 후 start 사용 가능 함.
		Thread t2 = new Thread(at2);
		t1.start();
		t2.start();
		
		try {
			t1.join();//main 함수를 t1이 종료될때까지 잡아두고 있는다.
			t2.join();
		}catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println("main thread end");
	}

}
