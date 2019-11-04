package series.fun.java.chap03.lec05;

public class StringBufferBuilderEx {

	/*** 주요 메서드 ***/
//	public void setLength(int newLength)
//	public char charAt(int index)
//	public StringBuffer append(Object obj)
//	public StringBuffer deleteCharAt(int index)
//	public StringBuffer replace(int start, int end, String str)
//	public StringBuffer insert(int dstOffset, CharSequence s, int start, int end)
//	public String substring(int start, int end)
//	public int indexOf(String str)
//	public String toString()
	
	public static void main(String[] args){
		
		int cnt = 10000;
		
		/* String 성능 */ String str = "";
		long start = System.currentTimeMillis();
		for(int i = 0 ; i < cnt ; i++ ) {
			str += Integer.toString(i);
		}
		long end = System.currentTimeMillis();
		System.out.println("String 걸린 시간 : " + (end-start));
		
		/* StringBuffer 성능 */ StringBuffer sb = new StringBuffer();
		start = System.currentTimeMillis();
		for(int i = 0 ; i < cnt ; i++ ) {
			sb.append(i);
		}
		end = System.currentTimeMillis();
		System.out.println("StringBuffer 걸린 시간 : " + (end-start));
		
		/* StringBuilder 성능 */ StringBuilder sb2 = new StringBuilder();
		start = System.currentTimeMillis();
		for(int i = 0 ; i < cnt ; i++ ) {
			sb2.append(i);
		}
		end = System.currentTimeMillis();
		System.out.println("StringBuilder 걸린 시간 : " + (end-start));
	}
}
