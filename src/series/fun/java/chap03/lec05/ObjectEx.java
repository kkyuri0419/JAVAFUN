package series.fun.java.chap03.lec05;

/*
 * Object 클래스는 모든 클래스의
 * 최상위 부모 객체이다.
 */
//class Dog extends Object
class Dog{}

public class ObjectEx {
	public static void main(String[] args) {
		Dog dog = new Dog();
		//public final Class<?> getClass()
		Class classInfo = dog.getClass();
		System.out.println(classInfo.getName());
		/*
		 * Class의 정보를 보고 싶을 때 getClass()를 통해 정보를 얻을 수 있다
		 */
		
		//public int hashCode()
		System.out.println(dog.hashCode());
		/*
		 * 객체 값에 대한 해쉬코드 값을 int형으로 return한다.
		 */
		
		//public Boolean equals(Object obj)
		System.out.println(dog.equals(new Object()));
		/*
		 * 같은 객체인지 아닌지 판단해준다. 서로 객체같은 객체라면 true, 아니면 false가 반환된다.
		 */
		
		//public String toString()
		System.out.println(dog);
		System.out.println(dog.toString());
		/*
		 * toString()은 참조 변수를 직접 출력했을 때 뜨는 것과 같다.
		 * 즉, toString()을 오버라이딩해서 내용을 변경하면, 출력 시 오버라이딩한 내용이 뜬다.
		 */
		
	}
}
