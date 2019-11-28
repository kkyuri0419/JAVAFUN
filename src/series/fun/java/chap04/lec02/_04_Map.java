package series.fun.java.chap04.lec02;

import java.util.HashMap;

/*
 * Key와 Value로 이루어짐
 * Key값은 중복이 안되고,
 * Value는 중복이 허용이 된다.
 * value를 key값으로 찾는다. 파이썬의 딕셔너리.
 */
public class _04_Map {
	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		String id = "yuri";
		String password = "1234";
		hm.put(id, password);
		System.out.println(hm.get("yuri"));
	}
}
