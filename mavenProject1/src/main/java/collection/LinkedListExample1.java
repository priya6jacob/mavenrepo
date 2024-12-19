package collection;

import java.util.LinkedList;

public class LinkedListExample1 {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("India");
		ll.add("USA");
		ll.add("China");
		ll.add("UK");
		ll.add("India");
		System.out.println(ll);
		LinkedList<String> l2=new LinkedList<String>();
		l2.add("Mango");
		l2.add("Apple");
		l2.add("Grapes");
		ll.addAll(l2);
		System.out.println(ll);
		boolean b1=ll.contains("USSR");
		System.out.println(b1);
		System.out.println(ll.get(3));
		boolean b2=ll.isEmpty();
		System.out.println(b2);
		ll.remove(2);
		System.out.println(ll);
		ll.remove(5);
		System.out.println(ll);
		System.out.println(ll.size());

	}

}
