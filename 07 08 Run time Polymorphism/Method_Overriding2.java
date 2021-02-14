class MO2A
{
	void m1()
	{
		System.out.println("Hello M1 of Class A");
	}
}

class MO2B extends MO2A
{
	void m1()//Overriding the m1() method of MO2A class.
	{
		System.out.println("Hello M1 of Class B");
	}
	void m2()
	{
		System.out.println("Hello M2 of Class B");
	}
}

class MethodOverriding2
{
	public static void main(String[] args){
		MO2B a=new MO2B();
		a.m1();
		a.m2();
	}
}