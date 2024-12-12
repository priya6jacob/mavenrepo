package collection;

import java.util.ArrayList;
import java.util.List;

public class NonGenericExp1 {

	public static void main(String[] args) 
	{
		List l=new ArrayList();
		l.add(12);
		l.add("Priya");
		l.add(12.78f);
		l.add('N');
		System.out.println(l);

	}

}
