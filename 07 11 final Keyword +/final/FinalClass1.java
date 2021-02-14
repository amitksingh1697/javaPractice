final class ClassA//final abstract class ClassA
{
	//final class can never be inherited but I can use members of this class by creating an object.
	int x=20;
	void m1()
	{
		System.out.println("Hello m1 of ClassA");
	}
}

class FinalClass1//class FinalClass1 extends ClassA
{
	public static void main(String[] A){
		ClassA a=new ClassA();
		a.m1();
		System.out.println(a.x);
	}
}