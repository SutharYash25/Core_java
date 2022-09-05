import java.util.Scanner;

class Empl{
	private int id;
	private String name;
	Empl(){
	}
	Empl(int id,String name){
		this.id = id;
		this.name=name;
	}
	@Override
	public String toString() {
		return "id : "+id+" name :"+name;
	}
//	public void setId() {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter id : ");
//		this.id = sc.nextInt();
//	}
//	public int getId() {
//		return id;
//	}
}
public class EncapsulationDemo {
	public static void main(String[] args) {
//		Empl e= new Empl();
//		e.setId();
//		System.out.println(e.getId());
		Empl e2 = new Empl(10,"name");
		System.out.println(e2);
	}
}
