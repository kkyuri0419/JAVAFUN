package series.fun.java.chap06.Thread;

class AddThread2 extends Sum implements Runnable{
	
	Sum sumInst;
	int start,end;
	
	AddThread2(int start, int end,Sum sum){
		this.sumInst = sum;
		this.start = start;
		this.end = end;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub\
		for (int i = start; i <= end; i++) {
			System.out.println(i + "값 누적");
			sumInst.addNum(i); // Sum에서 상속 받음.
		}
	}
	
}

public class _03_ThreadHeapMultiAccess {
	public static void main(String[] args) {
		System.out.println("main thread start");
		
		Sum sumInst = new Sum();
		
		AddThread2 at1 = new AddThread2(1,50,sumInst);
		AddThread2 at2 = new AddThread2(51,100,sumInst);
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
		
		System.out.println("총 결과 값:" + sumInst.getNum());
		
		System.out.println("main thread end");
	}
}
