class Parent1{
	public void parentMehod() {
		System.out.println("parent class");
	}
}
class C2 extends Parent1{
	public void childMethod() {
		System.out.println("child 1 method");
	}
}
class C3 extends Parent1{
	public void childMethod() {
		System.out.println("child 2 method");
	}
}
class C4 extends Parent1{
	public void childMethod() {
		System.out.println("child 2 method");
	}
}
public class Hierachical {
	public static void main(String[] args) {
		C2 c2 = new C2();
		c2.childMethod();
		c2.parentMehod();
		C3 c3 = new C3();
		c3.childMethod();
		c3.parentMehod();
		C4 c4 = new C4();
		c4.childMethod();
		c4.parentMehod();
	}
}
