package example;

public class SelectionSort {
      
	public static void selectionSortLargestEle(int[] array)
	{
		int largest=array.length-1;
		int large;
		int temp=0;
		for(int i=0;i<array.length;i++)
		{
			large=array[largest];
			temp=0;
			for(int j=0;j<largest;j++)
			{
				if(array[j]>array[j+1] || large<array[j])
				{
					temp=array[j];
					array[j]=large;
					large=temp;
					array[largest]=large;
					
				}
			}
			largest--;
		}
		for(int b:array)
		{
			System.out.print(b+" ");
		}
	}
	
	
	public static void main(String[] args) {
		int[] a= {999,9999,99};
		selectionSortLargestEle(a);
		
		
    
	}

}
