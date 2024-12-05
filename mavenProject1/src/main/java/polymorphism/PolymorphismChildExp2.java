package polymorphism;

public class PolymorphismChildExp2 extends PolymorphismParentExp2
{
	public void mul(int a,int b)
	{
		super.mul(10,15);
		int c=a/b;
		System.out.println(c);
	}

	public static void main(String[] args)
	{
		PolymorphismChildExp2 pc2=new PolymorphismChildExp2();
		pc2.mul(12,10);

	}

}
