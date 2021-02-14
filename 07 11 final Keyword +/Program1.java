class Program1A
{
	void m1()//private void m1() restricts to bind the function call outside the call so overriding is not possible
	{
		System.out.println("Hello A");
	}
}
class Program1B extends Program1A
{
	void m1()
	{
		System.out.println("Hello B");
	}
}

class Program1
{
	public static void main(String A[]){
		Program1A a=new Program1B();
		a.m1();
	}
}