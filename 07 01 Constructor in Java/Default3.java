class Def3
{
	int salary;
	String name;
	Def3(int sal,String n)
	{
		System.out.println("Object Created");
		name=n;
		salary=sal;
	}
	void show()
	{
		System.out.println(name+"\t"+salary);
	}
}

class Default3
{
	public static void main(String[] s)
	{
		Def3 a=new Def3(200000,"Narendra Modi");
		Def3 b=new Def3(5,"Lalu Yadav");
		Def3 c=new Def3(3,"Arvind Kejriwal");
		a.show();
		b.show();
		c.show();
	}
}