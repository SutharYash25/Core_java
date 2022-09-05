import java.util.ArrayList;
import java.util.List;

class Laptop{
	int ram;
	int storage;
	String model;
	public Laptop(int ram, int storage, String model) {
		super();
		this.ram = ram;
		this.storage = storage;
		this.model = model;
	}
	@Override
	public String toString() {
		return "Laptop [ram=" + ram + ", storage=" + storage + ", model=" + model + "]";
	}
}
public class ArrayListPractical {
	public static void main(String[] args) {
		Laptop l1 = new Laptop(1, 8, "dell");
		Laptop l2 = new Laptop(2, 10, "hp");
		Laptop l3 = new Laptop(3, 12, "mac");
		Laptop l4 = new Laptop(4, 16, "asus");
		List<Laptop> list = new ArrayList<>();
		list.add(l1);
		list.add(l2);
		list.add(l3);
		list.add(l4);
		System.out.println(list);
	}
}
	