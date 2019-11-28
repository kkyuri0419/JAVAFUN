package series.fun.java.chap04.lec01;

class Person{}

class Children extends Person{}

class Student extends Children{}

class Adult extends Person{}

class School<T extends Children>{// extends Children을 했으니까 Children의 상속을 받는 Student나 Children만 가능. super는 extends의 반대개념이다.super Children을 하면 Children, Person, Object가 가능.
	T student;

	public T getStudent() {
		return student;
	}

	public void setStudent(T student) {
		this.student = student;
	}
	
	
	
}

public class _02_GenericUsage {
	public static void main(String[] args) {
		School<Student> stu = new School<Student>();
		stu.setStudent(new Student());
//		School<Adult> stu2 = new School<Adult>(); Error
		
	}

}
