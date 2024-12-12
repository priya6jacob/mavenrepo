package ExceptionExp;

public class ExceptionExp1
{

	public static void main(String[] args)
	{
		int a=10;
		int b=0;
		
		try
		{
		int c=a/b;
		
		System.out.println(c);
		}
		/*catch(ArithmeticException as)
		{
			int c=a+b;
			System.out.println(c);
		}*/
		
		finally
		{
			System.out.println("Execution completed successfully");
		}
		

	}

}
