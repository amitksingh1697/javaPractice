class RTPE2A
{
	int x=10;//Hided
	int y=20;
	void m1()
	{
		x=5;
		System.out.println("M1 of Class A");
		System.out.println("Value of x = "+x);
	}
	void m2()
	{
		System.out.println("M2 of Class A");
	}
}

class RTPE2B extends RTPE2A
{
	int x=8;//Data Hiding
	void m1()//Method Overriding.
	{
		x=4;
		System.out.println("M1 of Class B");
		System.out.println("Value of x = "+x);
		System.out.println("Value of y = "+y);
	}
}

class RTPE2
{
	public static void main(String[] args)
	{
		RTPE2A a=new RTPE2B();//Upcasting.
		a.m1();
		a.m2();
	}
}