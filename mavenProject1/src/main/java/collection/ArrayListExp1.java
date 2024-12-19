package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExp1 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Red");
		al.add("Green");
		al.add("White");
		al.add("Black");
		al.add("Blue");
		al.add("Yellow");
		Iterator<String> it=al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		it.remove();
		System.out.println(al);
	}

}
