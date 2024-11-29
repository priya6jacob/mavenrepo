package inheritance;

public class MultilevelChild extends MultilevelParent2
{
public void mul()
{
	int a=4;
	int b=5;
	int c=a*b;
	System.out.println(c);
}
	public static void main(String[] args)
	{
		MultilevelChild mc=new MultilevelChild();
		mc.add();
		mc.sub();
		mc.mul();

	}

}
