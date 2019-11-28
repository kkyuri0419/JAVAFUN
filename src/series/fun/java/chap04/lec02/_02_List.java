package series.fun.java.chap04.lec02;

import java.util.ArrayList;

/*
 * Collection은 크게 List, Set, Map가 있다.
 * 
 * List의 대표적인 컬렉션 클래스는 ArrayList, LinkedList이다.
 * Set의 대표적인 컬렉션 클래스는 HashSet이다.
 * Map의 대표적인 컬렉션 클래스는 HashMap이다.
 */
public class _02_List {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>(5);// 기본 크기는 10.
		al.add(10);
		al.add(20);
		System.out.println(al.get(1));
	}
}
