package example;

public class EMI {

	public static void main(String[] args) {
  
     float p=100000;
       float i=12;
       float n=1;
       float i1=i/(i*100);
       float res1= (float) Math.pow(1.01, 12);
       System.out.println(i1+"   "+res1);
       float finalResult=(p*i1)*res1/(res1-1);
       System.out.println(finalResult);
       
      
	}

}
