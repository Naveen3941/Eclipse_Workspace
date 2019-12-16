import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
class Item
{
	void createItem()
	{
		
	}
}
public class ProducerAndConsumerProblem {
 static String item;
 private static Item createItem() {
		// TODO Auto-generated method stub
		return null;
	}
	public static void main(String[] args) {
		BlockingQueue<Item> queue=new ArrayBlockingQueue(10);
		final Runnable producer=() ->
		{
			while(true)
			{
				try {
					queue.put(createItem());
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};

	}
	

}
