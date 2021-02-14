class Inherit1 extends Existing1
{
	int y=20;
	void m2(int b)
	{
		System.out.println("Inheriting class");
		System.out.println(b);
	}	
}

class Inheritance1
{
	public static void main(String[] args)
	{
		Inherit1 a=new Inherit1();

		System.out.println(a.x);
		System.out.println(a.y);
		a.m1(30);
		a.m2(40);
	}
}