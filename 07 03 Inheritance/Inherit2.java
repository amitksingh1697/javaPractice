class Inherit2 extends Existing2
{
	int y=20;
	void m2(int b)
	{
		System.out.println("Inheriting class");
		System.out.println(b);
	}	
}

class Inheritance2
{
	public static void main(String[] args)
	{
		Inherit2 a=new Inherit2();
		//System.out.println(a.x); private accees in its class
		System.out.println(a.y);
		a.m1(30);
		a.m2(40);
	}
}