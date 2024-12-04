package superKeyword;

public class SuperChildExp3 extends SuperParentExp3
{
	public SuperChildExp3()
	{
		super(4,5);
		int a=5;
		int b=3;
		int c=a-b;
		System.out.println(c);
	}
	public static void main(String[] args)
	{
		SuperChildExp3 sc3=new SuperChildExp3();
	}

}
