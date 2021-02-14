class This1
{
	This1(int x,int y)
	{
		this(4);
		System.out.println("Incapp");
	}
	This1(int x)
	{
		System.out.println("Hye");		
	}
	This1()
	{
		System.out.println("Hello");
	}
}

class ThisConstructor1
{
	public static void main(String[] args)
	{
		This1 a=new This1(5,2);
		This1 b=new This1();
		This1 c=new This1(4);
	}
	
}