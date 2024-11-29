package inheritance;

public class HierarchicalChild1 extends HierarchicalParent
{
	public void sub()
	{
		int a=14;
		int b=10;
		int c=a-b;
		System.out.println(c);
	}

	public static void main(String[] args)
	{
		HierarchicalChild1 hc=new HierarchicalChild1();
		hc.add();
		hc.sub();

	}

}
