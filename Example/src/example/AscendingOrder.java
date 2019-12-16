package example;

public class AscendingOrder {

	public static void main(String[] args) {
		int a[]= {2,3,4,1,7,8,9};
		int swap=0;
		 for(int i=0;i<a.length-1;i++)
         {
             for(int j=i+1;j<a.length;j++)
             {
                 if(a[i]>a[j])
                 {
                     swap=a[j];
                     a[j]=a[i];
                     a[i]=swap;

                 }
             }
         }
         for(int i=0;i<a.length;i++)
         {
            System.out.println(a[i]);
         }

	}

}
