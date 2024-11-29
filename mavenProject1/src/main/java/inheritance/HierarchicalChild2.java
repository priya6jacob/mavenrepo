package inheritance;

public class HierarchicalChild2 extends HierarchicalParent
{
	public void mul()
	{
		int a=3;
		int b=5;
		int c=a*b;
		System.out.println(c);
	}

	public static void main(String[] args)
	{
		HierarchicalChild2 hc2=new HierarchicalChild2();
		hc2.add();
		hc2.mul();

	}

}
