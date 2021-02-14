class Method1A 
{
	//final Method1 can never be overridden.
	final void m1()//final abstract void m1()
	{
		System.out.println("Hello m1 of Method1A");
	}
}
class Method1B extends Method1A
{
	int x=20;
	void m2()//void m1(); can't override the super's final Method1
	{
		System.out.println("Hello m1 of Method1B");
	}
}

class FinalMethod1
{
	public static void main(String[] A){
		Method1B a=new Method1B();
		a.m1();
		System.out.println(a.x);
	}
}