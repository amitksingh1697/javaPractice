class Static3
{
	private String name;
	private int salary;
	private String cname;
	static private String nation="Hindustan";
	
	void input(String n, int s, String c)
	{
		name=n;
		salary=s;
		cname=c;
	}
	void show()
	{
		System.out.println(name+" "+salary+" "+cname+" "+nation);
	}
}

class EStatic3
{
	public static void main(String s[])
	{
		Static3 a=new Static3();
		Static3 b=new Static3();
		Static3 c=new Static3();
		Static3 d=new Static3();

		a.input("Narendra Modi", 200000, "INDIA");
		b.input("Akhilesh Yadav", 150, "Uttar Pradesh");
		c.input("Lalu Yadav", 41, "Bihar");
		
		a.show();
		b.show();
	//	c.nation="INDIA"; Compile Time error because nation is private in Static3
		c.show();
		d.show();
	}
}