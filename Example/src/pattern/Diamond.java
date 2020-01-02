package pattern;

public class Diamond {

	public static void main(String[] args) {
		int a=5;
		 for(int i=1;i<=4;i++)
		 {
			 for(int k=i;k<=4;k++)
			 {
			 System.out.print(" ");
			 }
			 for(int j=a-i;j<=4;j++)
			 {
				 System.out.print(j+" ");
			 }
			 System.out.println();
		 }
		
		
		
 for(int i=2;i<=4;i++)
 { System.out.print(" ");	
	 for(int k=2;k<=i;k++)
	 {
	 System.out.print(" ");
	 }
	 for(int j=i;j<=4;j++)
	 {
		 System.out.print(j+" ");
	 }
	 System.out.println();
 }
 

	}

}
