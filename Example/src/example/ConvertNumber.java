package example;

public class ConvertNumber {

	public static void main(String[] args) {
		
		String a="254628";
		System.out.print(Integer.parseInt(a.substring(0, 1))+" ");
		for(int i=0;i<a.length()-1;i++)
		{
			int a1=Integer.parseInt(a.substring(i, i+1));
			int a2=Integer.parseInt(a.substring(i+1, i+2));
			
			if(a1%2==0 && a2%2==0)
			{
				System.out.print("@ "+Integer.parseInt(a.substring(i+1, i+2))+" ");
			}
			else
			{
				System.out.print(Integer.parseInt(a.substring(i+1, i+2))+" ");
			}
		}

	}

}
