class Def5
{
	int salary;
	String name;
	
	void Def5(int sal,String n)// Now,It becomes an method not constrcutor.
	{
		System.out.println("Object Created");
		name=n;
		salary=sal;
		System.out.println(name+"\t"+salary);
	}
	//Compiler will introduce default constrcutor
}

class Default5
{
	public static void main(String[] s)
	{
		Def5 a=new Def5();
		Def5 b=new Def5();
		Def5 c=new Def5();
	}
}