package example;

public class SequenceCount {

	public static void main(String[] args) {


     int count=0;
     
     int arr[]= {1,1,2,1,1,1,4};
     for(int i=0;i<arr.length-2;i++)
     {
    	 for(int j=0;j<=100;j++)
    	 {
    		 if(arr[i]==1*j && arr[i+1]==2*j && arr[i+2]==3*j)
    		 {
    			 count++;
    		 }
    	 }
    	 
    	 
     }
	}

}
