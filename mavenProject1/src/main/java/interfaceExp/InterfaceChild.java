package interfaceExp;

public class InterfaceChild implements InterfaceSample
{

	public static void main(String[] args)
	{
		InterfaceChild ic=new InterfaceChild();
		ic.add();
		ic.sub();

	}

	@Override
	public void add()
	{
		int a=5;
		int b=5;
		int c=a+b;
		System.out.println(c);
		
	}

	public void sub()
	{
		int a=10;
		int b=5;
		int c=a-b;
		System.out.println(c);
	}
}
