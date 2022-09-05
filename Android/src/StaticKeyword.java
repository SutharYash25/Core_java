class Student{
	static {
		System.out.println("static block inside student class");
	}
	int id;
	String name;
	static String iname="TOPS";
	Student(int id,String name){
		this.id=id;
		this.name=name;
	}
	public void show() {
		System.out.println("id : "+id+" name : "+name+" iname : "+iname);
	}
	public static void run() {
		System.out.println("this is run method");
	}
}
public class StaticKeyword {
	static {
		System.out.println("static block inside main class");
	}
	public static void main(String[] args) {
		Student s1 = new Student(1, "Pro");
		Student s2 = new Student(2, "Nirav");
		s1.show();
		s2.show();
		Student.run();
	}
}
