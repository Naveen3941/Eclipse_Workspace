package example;
interface Permission {
	
}
public class MarkableInterfaceExample implements Permission{
        static void show()
        {
        	System.out.println("showwwwwww");
        }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          MarkableInterfaceExample m=new MarkableInterfaceExample();
          if(m instanceof Permission)
          {
        	 show();
          }
          else
          {
        	  System.out.println("not permission......");
          }
	}

}
