class Car{
	public void name() {
		System.out.println("name method inside car class");
	}
	public void name(String name) {
		System.out.println("name method inside car class : "+name);
	}
	public void name(String name, double price) {
		System.out.println("name method inside car class : "+name+price);
	}
	
}
public class MethodOverloading {
	public static void main(String[] args) {
		Car c = new Car();
		c.name();
		c.name("bmw");
		c.name("mercedes", 1000.132245);
	}
}
