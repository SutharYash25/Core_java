class A {
	int n1,n2;
	A(int n1,int n2){
		this.n1 = n1;
		this.n2 = n2;
		System.out.println(n1+" : "+n2);
	}
	
	public void show() {
		System.out.println(n1+" : "+n2);
	}
//	A() {
//		System.out.println("default constructor");
//	}
//	A(int i){
//		System.out.println("para cons");
//	}
//	A(int i,int j){
//		System.out.println("para cond 2");
//	}
//	public void run() {
//		System.out.println("hello run method");
//	}
}
class B{
	int n1,n2;
	B(A a){
		this.n1 = a.n1;
		this.n2 = a.n2;
	}
	public void show() {
		System.out.println("B class : "+n1+" : "+n2);
	}
}
public class ConstructorDemo {
	public static void main(String[] args) {
		A a = new A(30, 20);
		a.show();
		
		B b  = new B(a);
		b.show();
//		A a = new A();
////		A a1 = new A();
//		a.run();
//		A a1 = new A(10);
//		A a2 =new A(10, 10);
	}
}
