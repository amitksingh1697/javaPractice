class Initialise
{
	int x=67;
	Initialise()
	{
		System.out.println("Default constructor");
	}
	Initialise(int x)
	{
		System.out.println("Parameterised constructor");
	}
	static
	{
		System.out.println("Static Block");	
	}
	{
		System.out.println("Initialise block");
	}
}

class Initialise_block
{
	public static void main(String[] args)
	{
		Initialise a=new Initialise();
		Initialise b=new Initialise(5);	
		System.out.println("Main Block");
	}
	
}  