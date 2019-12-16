package exception;
class AgeInvalidException extends Exception
{
	public AgeInvalidException(String name)
	{
		super(name);
	}
}
public class TestCustomException {
public static void main(String[] args) {
	int age=10;
	try
	{
		System.out.println("try");
		if(age==10)
		{
			throw new AgeInvalidException("naveen");
		}
		else
		{
			System.out.println("else condition:.....");
		}
			
	}
	catch(Exception e)
	{
		System.out.println("hai     "+e.getMessage());
	}
}
}
