class Parent{
	public void parentClasss() {
		System.out.println("Parent Clas");
	}
}
class Child extends Parent{
	public void childClass() {
		System.out.println("child class");
	}
}
public class InheritanceDemo {
	public static void main(String[] args) {
		Child c = new Child();
		c.parentClasss();
		c.childClass();
	}
}
