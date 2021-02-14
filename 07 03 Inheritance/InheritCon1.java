class InheritCon1 extends ExistingCon1
{
	InheritCon1()
	{
		System.out.println("Inheriting constructor.");	
	}
}

class InheritanceCon1
{
	public static void main(String[] args)
	{
		InheritCon1 a=new InheritCon1();
	}
}