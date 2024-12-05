package polymorphism;

public class PolymorphismChildExp1 extends PolymorphismParentExp1
{
	public void add(int a,int b)
	{
		super.add(15,16);
		int c=a-b;
		System.out.println(c);
	}


	public static void main(String[] args)
	{
		PolymorphismChildExp1 pc=new PolymorphismChildExp1();
		pc.add(15,10);
		

	}

}
