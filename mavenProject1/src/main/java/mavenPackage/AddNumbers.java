//Write pgm to add 2 numbers using instance method

package mavenPackage;

public class AddNumbers 
{
	int a=5;
	int b=10;
	int c=a+b;	
	public void add()
	{
	System.out.println(c);
	}
	
	public static void main(String[] args)
	{
		AddNumbers obj=new AddNumbers();
		obj.add();
		

}
}