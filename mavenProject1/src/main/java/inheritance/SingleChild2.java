package inheritance;

public class SingleChild2 extends SingleParent2
{
public void mul()
{
	int a=10;
	int b=5;
	int c=a*b;
	System.out.println(c);
}
	public static void main(String[] args)
	{
		SingleChild2 sc1=new SingleChild2();
		sc1.div();
		sc1.mul();
	}

}
