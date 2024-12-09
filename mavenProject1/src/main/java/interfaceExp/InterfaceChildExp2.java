package interfaceExp;

public class InterfaceChildExp2 implements InterfaceParent1,InterfaceParent2
{

	public static void main(String[] args)
	{
		InterfaceChildExp2 ic2=new InterfaceChildExp2();
		ic2.div();
		ic2.mul();
	}

	@Override
	public void div() 
	{
	int a=20;
	int b=10;
	int c=a/b;
	System.out.println(c);
		
	}

	@Override
	public void mul()
	{
		int a=4;
		int b=5;
		int c=a*b;
		System.out.println(c);
		
	}

}
