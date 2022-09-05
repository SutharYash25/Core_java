final class class1{
	final int i=1;
	final public void changeValue() {
		i++;
		System.out.println(i);
	}
}
class class2 extends class1{
	final int i=1;
	public void changeValue() {
		i++;
		System.out.println(i);
	}
}
public class finalKeyword {
	public static void main(String[] args) {
		class1 c = new class1();
		c.changeValue();
	}
}
