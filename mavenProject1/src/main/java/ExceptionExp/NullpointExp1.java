package ExceptionExp;

public class NullpointExp1 
{

	public static void main(String[] args)
	{
		String a=null;
		try
		{
		System.out.println(a.length());
		}
		catch(NullPointerException bc)
		{
		 String b="Priya";
		 System.out.println(b.length());
		 System.out.println(bc);
		}
		
		finally
		{
			System.out.println("Executed successfully");
		}
		

	}

}
