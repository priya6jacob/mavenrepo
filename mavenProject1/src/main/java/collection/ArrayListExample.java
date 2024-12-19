package collection;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Red");
		al.add("Green");
		al.add("White");
		al.add("Black");
		al.add("Blue");
		al.add("Yellow");
		ArrayList<String> a2=new ArrayList<String>();
		a2.add("Gold");
		a2.add("Silver");
		a2.add("Diamond");
		al.addAll(a2);
		System.out.println(al);
		boolean b=al.contains("Black");
		System.out.println(b);
		System.out.println(al.get(1));
		boolean b1=al.isEmpty();
		System.out.println(b1);
		al.remove(0);
		System.out.println(al);
		al.remove("Blue");
		System.out.println(al);
		System.out.println(al.size());
		
		

	}

}
