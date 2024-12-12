package ExceptionExp;

public class AdditionExceptionExp1 
{

	public static void main(String[] args) throws AdditionException 
	{
		int a=10;
		int b=20;
		if(a>b)
		{
			System.out.println("a is greater");
		}
		else
		{
			throw new AdditionException("b is greater");
		}

	}

}
