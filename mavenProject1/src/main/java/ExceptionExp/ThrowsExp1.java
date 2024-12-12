package ExceptionExp;

public class ThrowsExp1 {

	public static void main(String[] args)
	{
		int age=15;
		if(age>18)
		{
			System.out.println("Eligible for voting");
		}
		else
		{
			throw new ArithmeticException("under age");
		}

	}

}
