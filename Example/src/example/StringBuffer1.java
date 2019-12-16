package example;
import java.util.Date;
import java.text.DateFormat;

public class StringBuffer1 {
	public static int getTotal(String a,String b)
	{
		try
		{
			int value1=Integer.parseInt(a);
			int value2=Integer.parseInt(b);
			return value1+value2;
		}
		catch(NumberFormatException e)
		{
			return -1;
		}
		finally {
			return -2;
		}
		
	}

	public static void main(String[] args) {
		String a="3";
		String b="4g";
		System.out.println(getTotal(a,b));
		
	}

}
