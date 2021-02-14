class Def4
{
	int salary;
	String name;
	Def4(int sal,String n)
	{
		System.out.println("Object Created");
		name=n;
		salary=sal;
		System.out.println(name+"\t"+salary);
	}
}

class Default4
{
	public static void main(String[] s)
	{
		Def4 a=new Def4(200000,"Narendra Modi");
		Def4 b=new Def4(5,"Lalu Yadav");
		Def4 c=new Def4(3,"Arvind Kejriwal");
	}
}