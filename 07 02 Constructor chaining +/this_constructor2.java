class This2
{
	This2(int x,int y)
	{
		this(4);
		System.out.println("Incapp");
	}
	This2(int x)
	{
		this();
		System.out.println("Hye");		
	}
	This2()
	{
		System.out.println("Hello");
	}
}

class ThisConstructor2
{
	public static void main(String[] args)
	{
		This2 a=new This2(5,2);
	}
	
}