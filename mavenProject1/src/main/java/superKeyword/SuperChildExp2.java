//To refer the immediate parent class instance method

package superKeyword;

public class SuperChildExp2 extends SuperparentExp2
{
	public void add()
	{
		int a=10;
		int b=15;
		int c=a+b;
		System.out.println(c);
		super.display();
	}

	public static void main(String[] args)
	{
		SuperChildExp2 sc=new SuperChildExp2();
		sc.add();

	}

}
