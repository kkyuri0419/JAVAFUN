package series.fun.java.chap04.lec02;
// Collection은 다 Generic으로 쓴다.
class ArrayListSample<T>{
	T[] arr;
	int sw = 0;//switch
	
	public void add(T t) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == null || arr[i] == "") {
				arr[i] =t;
				return;
			}
		}//for

		/*
		 * 이곳까지 왔다는 것은 배열 꽉 찼다는 것
		 * 그래서 크기가 1 더 큰 새로운 배열을 다시 만들어서
		 * 원래 배열에 들어있는 값과 새로운 값을 합쳐서 넣는다.
		 */
		
	}//add()
}

public class _01_CollectionIntro {
	public static void main(String[] args) {
		String[] strArr = new String[3];
		strArr[0] = "A";
		strArr[1] = "B";
		strArr[2] = "C";
		strArr[3] = "D";//NullpointException
		strArr[4] = "E";//NullpointException
		//배열이 한번 크기가 정해지면 고정되는 불편함.
	}
}
