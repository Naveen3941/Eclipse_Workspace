package stream;

public class NumberCount {

	public static void main(String[] args) {
		int arr[]= {1,2,2,4,7,6,3,2,6,0,8,7,4,12,17,23,17,1,0,0,0,0};
		int res[]=new int[100];
		for(int i=0;i<arr.length;i++)
		{
			
			int c=arr[i];
			res[c]++;
		}
		for(int i=0;i<res.length;i++)
		{
			if(res[i]!=0 && res[i]!=1)
			{
				System.out.println(i+"..."+res[i]);
			}
		}
		
	}

}
