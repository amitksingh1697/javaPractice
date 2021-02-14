class RTPE1A
{
	void m1()
	{
		System.out.println("M1 of Class A");
	}

}

class RTPE1B extends RTPE1A
{
	void m2()
	{
		System.out.println("Runtime Polymorphism Example");
		System.out.println();
	}
	void m1()//Method Overriding.
	{
		System.out.println("M1 of Class B");
	}
}

class RTPE1
{
	public static void main(String[] args){
		RTPE1B b=new RTPE1B();
		b.m1();
		b.m2();
		RTPE1A a=b;//Upcasting.
		a.m1();
		//a.m2();
		//Method binds with the reference variable and runs according to the object.
	}
}