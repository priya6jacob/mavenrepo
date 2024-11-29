package inheritance;

public class SingleChild extends SingleParent
{
public void sub()
{
	int a=20;
	int b=10;
	int c=a-b;
	System.out.println(c);
}
	public static void main(String[] args)
	{
		SingleChild sc=new SingleChild();
		sc.add();
		sc.sub();

	}

}
