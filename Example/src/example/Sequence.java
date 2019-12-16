package example;

public class Sequence {

	public static void main(String[] args) {
    boolean flag=false;
    int b[]= {6,9,12};
    int arr[]= {0,3,6,9,12,18,29};
    int count=0;
    for(int i=0;i<arr.length;i++) {
    	if(arr[i]==b[count])
    	{
    		count++;
    		if(count==3)
    		{
    			break;
    		}
    		
    	}
    }
    System.out.println(count);
    if(count==3)
    	System.out.println(true);
    else
    	System.out.println(false);

	}

}
