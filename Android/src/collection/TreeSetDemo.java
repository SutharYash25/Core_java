package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		Set set  = new TreeSet<>();
		set.add(1);
		set.add(45);
		set.add(-12);
		set.add(23);
		set.add(0);
		set.add(11);
		System.out.println(set);
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
