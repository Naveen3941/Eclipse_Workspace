package thread;

import java.util.concurrent.atomic.AtomicInteger;

public class VolatileExample extends Thread{
	volatile boolean  flag=true;
	 AtomicInteger a=new AtomicInteger(1);
	 public synchronized void  run()
	    {
	    	while(flag)
	    	{
	    	for(int i=1;i<=10;i++)
	    	{
	    		System.out.println(i+"..."+Thread.currentThread().getName()+"...."+a+"///"+flag);
	    	}
	    	this.flag=false;
	    	a.getAndIncrement();
	    	System.out.println("////////////"+a);
	    	
	    	}
	    }
	
	
	public static void main(String[] args) {
		VolatileExample v1=new VolatileExample();
		VolatileExample v2=new VolatileExample();
		VolatileExample v3=new VolatileExample();
		VolatileExample v4=new VolatileExample();
		v1.start();
		v2.start();
		
		v3.start();
		v4.start();
		
		
		System.out.println(v1.flag);

	}

}