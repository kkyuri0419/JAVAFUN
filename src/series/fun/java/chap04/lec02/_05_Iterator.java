package series.fun.java.chap04.lec02;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
//Iterator는 Map을 제외한 컬렉션(List, Set)에서 다 쓸 수 있다.
public class _05_Iterator {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("RHIE");
		hs.add("yuri");
		hs.add("ROB");
		hs.add("Eddie");
		
		
		//HashSet에 저장된 모든 값 출력하기.
		Iterator itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		//이미 여기서 토큰을 다 씀. 하시 하려면 iterator()를 다시 써서 넘겨줘야 함.
		while(itr.hasNext()) {
			System.out.println("있나?");
			System.out.println(itr.next());
		}
		
		//Map
//		HashMap hm = new HashMap(); // ==> HashMap<Object, Object> hm = new HashMap<Object, Object>();
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "A");
		hm.put(2, "B");
		hm.put(3, "C");
		hm.put(4, "D");
		
		//Map을 Set으로 바꿈. -> Iterator을 쓸 수 있음.
		Set<Entry<Integer,String>> s =  hm.entrySet();
		Iterator i = s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		//Key값이나 Value만 따로 빼는건 API참조.
		//keySet() -> Key만 Set으로 만듬.
		//values() -> Value만 Set으로 만듬.
	}
}
