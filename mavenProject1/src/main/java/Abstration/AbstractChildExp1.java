package Abstration;

public class AbstractChildExp1 extends AbstractParentExp1
{

	public static void main(String[] args)
	{
		AbstractChildExp1 ac=new AbstractChildExp1();
		ac.add();
		ac.sub();
	}

	@Override
	public void add()
	{
		int a=12;
		int b=10;
		int c=a+b;
		System.out.println(c);
		
	}

}
