package accessmodifier;

public class AccessModifierExp1
{
public void add()
{
	int a=5;
	int b=10;
	int c=a+b;
	System.out.println(c);
}
private void sub()
{
	int a=15;
	int b=10;
	int c=a-b;
	System.out.println(c);
}
protected void mul()
{
	int a=6;
	int b=3;
	int c=a*b;
	System.out.println(c);
}
void div()
{
	int a=6;
	int b=3;
	int c=a/b;
	System.out.println(c);
}

	public static void main(String[] args)
	{
		AccessModifierExp1 am=new AccessModifierExp1();
		am.add();
		am.sub();
		am.mul();
		am.div();

	}

}
