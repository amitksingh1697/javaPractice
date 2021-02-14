class Method2A 
{
	final private void m1()
	{
		System.out.println("Hello m1 of Method2A");
	}
	public static void main(String[] csp){
		Method2A a=new Method2B();
		a.m1();
	}
}

class Method2B extends Method2A
{
	void m1()
	{
		System.out.println("Hello m1 of Method2B");
	}
}
