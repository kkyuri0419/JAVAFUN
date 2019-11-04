package series.fun.java.chap03.lec02;

import java.util.Scanner;

interface LifeCycle{
	//public static final String copyrighter = "ROB";
	String copyrighter = "ROB";

	//public abstract void init();
	void init();

	public abstract void config();

	public abstract void run();

	public abstract void destroy();

}

class FirstNetwork implements LifeCycle{
	private boolean isTerminated;
	private String serverLocation;
	private String purpose;
	private int limitNum;
	private int connectingNum;

	@Override
	public void init() {
		this.isTerminated = false;
		this.serverLocation = "Seoul";
		this.purpose = "Blogging";
		this.limitNum = 100;
	}

	@Override
	public void config() {
		System.out.println("=====서버 정보=====");
		System.out.println("위치 : " + serverLocation);
		System.out.println("목적 : " + purpose);
		System.out.println("최대 접속 가능 수 : " + limitNum);
		System.out.println("================");
	}

	@Override
	public void run() {
		System.out.println(((isTerminated)?"종료됨":"실행중"));
	}

	@Override
	public void destroy() {
		this.isTerminated = true;
	}

}

abstract class KoreaNetwork implements LifeCycle{
	private boolean isTerminated;
	private String serverLocation;
	private String purpose;
	private int limitNum;
	private int connectingNum;
	
	KoreaNetwork(){
		init();
	}
	
	@Override
	public void init() {
		this.isTerminated = false;
		this.serverLocation = "Seoul";
		this.purpose = "Blogging";
		this.limitNum = 100;
	}

	@Override
	public void config() {
		System.out.println("=====서버 정보=====");
		System.out.println("위치 : " + serverLocation);
		System.out.println("목적 : " + purpose);
		System.out.println("최대 접속 가능 수 : " + limitNum);
		System.out.println("================");
	}

	@Override
	public void destroy() {
		this.isTerminated = true;
	}
	
	public boolean getTerminated() {
		return isTerminated;
	}
}

class SecondNetwork extends KoreaNetwork{
	@Override
	public void run() {
		System.out.println(((super.getTerminated())?"종료됨":"실행중"));
	}
	
}

public class InterfaceEx {
	public static void main(String[] args) {
		FirstNetwork net1 = new FirstNetwork();
		net1.init();
		net1.config();
		net1.run();
		net1.destroy();
		net1.run();
		System.out.println("||||||||||||||||||||||||||||||||||||||||||||");
		SecondNetwork net2 = new SecondNetwork();
		net2.config();
		net2.run();
		net2.destroy();
		net2.run();
	}
}
