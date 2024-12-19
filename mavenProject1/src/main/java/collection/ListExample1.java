package collection;

import java.util.ArrayList;
import java.util.List;

public class ListExample1 {

	public static void main(String[] args) {
		List<String> l1=new ArrayList<String>();
		l1.add("Food");
		l1.add("Air");
		l1.add("Food");
		l1.add("Water");
		l1.add("Drinks");
		l1.add("Fire");
		l1.add("Water");
		System.out.println(l1);
		l1.set(4, "Cake");
		System.out.println(l1);
		l1.indexOf("Food");
		System.out.println(l1.indexOf("Food"));
		l1.lastIndexOf("Food");
		System.out.println(l1.lastIndexOf("Food"));
		l1.remove("Air");
		System.out.println(l1);
		l1.remove(1);
		System.out.println(l1);
		System.out.println(l1.get(3));
		boolean b=l1.contains("Home");
		System.out.println(b);

	}

	
}
