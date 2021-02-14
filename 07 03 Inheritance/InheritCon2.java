class InheritCon2 extends ExistingCon2
{
	InheritCon2()
	{	
		this(4);
		System.out.println("Default Inheriting constructor.");	
	}
	InheritCon2(int a)
	{
		super();
		System.out.println("Parameterised Inheriting constructor.");	
	}
}

class InheritanceCon2
{
	public static void main(String[] args)
	{
		InheritCon2 a=new InheritCon2();
	}
}