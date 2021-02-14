class SuperF1 extends Super1
{
	int x=30;
	void m2()
	{
		int x=40;
		System.out.println(this.x);
		System.out.println(x);
	}
	void m3()
	{
		int x=50;
		System.out.println();
		System.out.println(super.x);
		super.m1();
		m1();
		System.out.println(x);
	}
}

class SuperFeild1
{
	public static void main(String[] args)
	{
		SuperF1 a=new SuperF1();
		System.out.println(a.x);
		a.m1();
		a.m2();
		a.m3();
	}
}