package interfacedemo;
interface inter1{
	public void inteface1();
	public static void interface4() {
		System.out.println("static in interface1 ");
	}
}
interface inter2 extends inter1{
	public void inteface2();
}
interface inter3{
	public void inteface3();
}
class Call implements inter2,inter3{

	@Override
	public void inteface1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void inteface3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void inteface2() {
		// TODO Auto-generated method stub
		
	} 
	
}
public class intercall {
	public static void main(String[] args) {
		Call c = new Call();
		c.inteface1();
		c.inteface2();
		c.inteface3();
		inter1.interface4();
	}
}
