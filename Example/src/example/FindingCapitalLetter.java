package example;

public class FindingCapitalLetter {

	public static void main(String[] args) {
		String a="saiKrishna";
		for(int i=0;i<a.length();i++)
		{
			int n=a.charAt(i);
			
			if(n<=96)
			{
			System.out.println(a.substring(0,i)+"  "+a.substring(i,a.length()));
			}
		}

	}

}
