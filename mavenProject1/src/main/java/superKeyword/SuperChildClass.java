package superKeyword;

public class SuperChildClass extends SuperParentClass
{
String colour="Blue";
public void display()
{
	System.out.println(super.colour);
	System.out.println(colour);
}
	public static void main(String[] args) 
	{
		SuperChildClass sc=new SuperChildClass();
		sc.display();

	}

}
