package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//<generics>
public class ListDemo {
	public static void main(String[] args) {
		List list = new ArrayList<>();
//		ArrayList list = new ArrayList<>();
		list.add(12);
		list.add("name");
		list.add(12.3);
		list.add(false);
		list.add('f');
		list.add(12);
		list.add(1346587);
		list.add("java");
		list.remove(3);
		System.out.println(list);
		System.out.println("size of list : "+list.size());
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
