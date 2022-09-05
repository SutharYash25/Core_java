
class Emp1{
	int id;
	String name;
	public void show(int id,String name) {
		this.id = id;
		this.name=name;
		System.out.println("emp1 method"+id+name);
	}
}
class Emp2 extends Emp1{
	int id;
	String name;
	public void show(int id,String name) {  
		this.id = id;
		this.name=name;
		System.out.println("emp2 method"+id+name);
		super.show(id, name);
	}
}
public class MethodOverriding {
	public static void main(String[] args) {
		Emp2 e = new Emp2();
		e.show(1, "abc");
	}
}
