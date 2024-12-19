package collection;

import java.util.HashSet;
import java.util.Set;

public class SetExample1 {

	public static void main(String[] args) {
		
Set<String> s1=new HashSet<String>();
s1.add("Wind");
s1.add("Storm");
s1.add("Rain");
s1.add("Water");
s1.add("Heat");
s1.add("Humid");
s1.add("Storm");	//duplicate element not added
Set<String> s2=new HashSet<String>();
s2.add("Apple");
s2.add("Banana");
s2.add("Orange");
System.out.println(s1);
s1.addAll(s2);
System.out.println(s1);
System.out.println(s1.size());
boolean b1=s1.contains("Heat");
System.out.println(b1);
boolean b2=s1.isEmpty();
System.out.println(b2);
s1.remove("Wind");
System.out.println(s1);





	}

}
