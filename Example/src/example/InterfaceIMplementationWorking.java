package example;
interface A
{
	public void save();
}
interface B extends A
{
	
}
interface C extends B
{
	
}
public class InterfaceIMplementationWorking implements C{

	public static void main(String[] args) {
		

	}

	@Override
	public void save() {
		System.out.println("it is working.......");
		
	}

}
