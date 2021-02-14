class MO1A
{
	void m1()
	{
		System.out.println("Hello M1 of Class A");
	}
}

class MO1B extends MO1A
{
	void m2()
	{
		System.out.println("Hello M2 of Class B");
	}
}

class MethodOverriding1
{
	public static void main(String[] args){
		MO1B a=new MO1B();
		a.m1();//Here I don't like that It prints class A. In next program I will override this method.
		a.m2();
	}
}