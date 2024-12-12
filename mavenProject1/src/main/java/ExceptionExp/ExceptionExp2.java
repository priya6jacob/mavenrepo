package ExceptionExp;

public class ExceptionExp2
{

	public static void main(String[] args) throws VotingException 
	{
		int age=15;
		if(age>18)
		{
			System.out.println("Eligible for voting");
		}
		else
		{
			throw new VotingException("under age");
		}
		
	}

}
