package example;

import java.math.BigDecimal;
import java.math.MathContext;

public class Example1 {

	public static void main(String[] args) {
		String a="ramu";
		String b=new String("ramu");
		if(a.equals(b))
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
		
//		MathContext mathContext=new MathContext(5);
//		System.out.println(mathContext);
//		BigDecimal x=new BigDecimal("3.145", mathContext);
//		System.out.println(x);
//		BigDecimal y=new BigDecimal("1.792", mathContext);
		//BigDecimal sum=x.rremainder(y);
		//System.out.println(sum);
		//int e=07_08_09;
	}

}
