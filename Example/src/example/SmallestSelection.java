package example;

public class SmallestSelection {

	 public static void selectionSortLargestEle(int[] arr){  
	        for (int i = 0; i < arr.length - 1; i++)  
	        {  
	            int index = i;  
	            for (int j = i + 1; j < arr.length; j++){  
	                if (arr[j] < arr[index]){  
	                    index = j;//searching for lowest index  
	                }  
	            }  
	            int smallerNumber = arr[index];   
	            arr[index] = arr[i];  
	            arr[i] = smallerNumber;  
	        }  
	     

		for(int b:arr)
		{
			System.out.print(b+" ");
		}
	
	 }
	
	public static void main(String[] args) {
		int[] a= {11,15,12,10};
		selectionSortLargestEle(a);
		
		
    
	}

}