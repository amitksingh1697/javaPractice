class Program2A
{
	void m1()
	{
		System.out.println("Hello A");
	}
}
class Program2B extends Program2A
{
	void m1()//private void m1(), It is weaker access privilage.
	{
		System.out.println("Hello B");
	}
}

class Program2
{
	public static void main(String A[]){
		Program2A a=new Program2B();
		a.m1();
	}
}