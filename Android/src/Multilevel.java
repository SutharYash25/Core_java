
class C{
	public void classC() {
		System.out.println("C class method");
	}
}
class D extends C{
	public void classD() {
		System.out.println("D class method");
	}
}
class E extends D{
	public void classE() {
		System.out.println("E class method");
	}
}

public class Multilevel {
	public static void main(String[] args) {
		E e = new E();
		e.classC();
		e.classD();
		e.classE();
	}
}
