package series.fun.java.chap06.Thread;

/*Thread를 만드는 첫번째 방법
 * 1) Thread를 상속하는 클래스를 만든다.
 * 2) run() 메서드에 동작하고 싶은 기능을 구현한다.
 * 3) Thread 객체의 start() 메서드를 호출한다.
 * 4) run() 메서드가 동작한다.
 */

class ShowThread extends Thread {

	String threadName;

	ShowThread(String threadName) {
		this.threadName = threadName;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("안녕하세요!" + threadName + "입니다.");
			try {
				sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}
}

public class _01_ThreadUnderstand {
	public static void main(String[] args) {
		ShowThread st1 = new ShowThread("알파");
		ShowThread st2 = new ShowThread("베타");
		st1.start();
		st2.start();
	}
}
