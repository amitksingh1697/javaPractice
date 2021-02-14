class SuperF2 extends Super2
{
	int x=30;
	void m1()
	{
		int x=40;
		System.out.println(this.x);
		System.out.println(x);

		System.out.println();
		System.out.println(super.x);
		super.m1();
	}
}

class SuperFeild2
{
	public static void main(String[] args)
	{
		SuperF2 a=new SuperF2();
		System.out.println(a.x);
		a.m1();
		//we can't call m1() method of superclass, we can call m1() of the subclass in case of same method name of superclass and subclass	
		//only subclass can call the method of superclass. 
	}
}