package thread;

public class MultiThreading1 extends Thread{
	public void run()
	{
	System.out.println("running");	
	}
	/*public void start()
	{
		System.out.println("starting");
	}*/

	public static void main(String[] args) {
		MultiThreading1 m1=new MultiThreading1();
         m1.start();
	}

}
