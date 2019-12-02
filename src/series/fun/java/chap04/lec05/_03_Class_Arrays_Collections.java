package series.fun.java.chap04.lec05;

import java.util.ArrayList;
import java.util.Collections;

public class _03_Class_Arrays_Collections {

	public static void main(String[] args) {
		String[] strArr = new String[] {"b", "e", "a", "d", "c"};
		ArrayList<String> al = new ArrayList<String>();
		
		for(int i = 0; i< strArr.length; i++) {
			al.add(strArr[i]);
		}
		
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		
		Collections.sort(al, (o1,o2)->o2.compareTo(o1));
		System.out.println(al);
	}
}
