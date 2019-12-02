package series.fun.java.chap04.lec05;

import java.util.Arrays;
import java.util.Comparator;

public class _02_Class_Arrays_Collections {
	public static void main(String[] args) {
		String[] strArr = new String[] {"b", "e", "a", "d", "c"};
		
		
		/***Arrays 클래스는 배열을 좀 더 쉽게 사용할 수 있게 한다.***/
		System.out.println(Arrays.toString(strArr));
		Arrays.sort(strArr);// 오름차
		System.out.println(Arrays.toString(strArr));
		
		
		//내림차순. Comparator 클래스의 compare() 구현
		Arrays.sort(strArr, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			
		});
		
	}
}
