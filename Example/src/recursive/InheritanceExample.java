package recursive;
class B 
{
	int a=10;
	
	 void m1()
	{
		System.out.println("m3()");
	}
	void m3()
	{
		System.out.println("m1()");
	}
}
public class InheritanceExample extends B {

	int b=120;
	 void m1()
	{
		System.out.println("m1()>>>>>>>>");
	}
	static void m2()
	{
		System.out.println("m2()>>>>>>>>");
	}
	public static void main(String[] args) {
		B b=new InheritanceExample();
		B b2=new B();
		InheritanceExample b3=new InheritanceExample();
		b.m1();
		b2.m1();
		b3.m1();
		
		
		
	}
}
