package thread;
class Test1 extends Thread
{
	
}
class Test2 extends Thread
{
	
}
public class VolatilePractice {
boolean flag=true;
 VolatilePractice v;
 
public void run()
{
	for(int i=0;i<=10;i++)
	{
	System.out.println("rnning ");
	}
}
	public static void main(String[] args) {
		VolatilePractice v1=new VolatilePractice();
       Test1 t1=new Test1();
       Test2 t2=new Test2();
       t1.start();
       t2.start();


	}

}
