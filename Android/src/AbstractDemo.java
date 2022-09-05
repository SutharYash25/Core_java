abstract class RBI {
	public abstract void interest();
	public abstract void homeloan();
	public void repoRate() {
		System.out.println("repo rate");
	}
}
class SBI extends RBI {
	public void interest() {
		System.out.println("sbi interest : 5%");
	}
	public void homeloan() {
		System.out.println("sbi home loan : 6%");
	}
}
class Java extends RBI {
	public void interest() {
		System.out.println("java interest : 6%");
	}
	public void homeloan() {
		System.out.println("java home loan : 5%");
	}
}
public class AbstractDemo {
	public static void main(String[] args) {
		SBI s = new SBI();
		s.interest();
		s.homeloan();
		Java j = new Java();
		j.interest();
		j.homeloan();
	}
}
