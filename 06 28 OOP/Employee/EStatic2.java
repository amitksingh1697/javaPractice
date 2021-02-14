class Static2
{
	private String name;
	private int salary;
	private String cname;
	static String nation="Hindustan";
	
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

class EStatic2
{
	public static void main(String s[])
	{
		Static2 a=new Static2();
		Static2 b=new Static2();
		Static2 c=new Static2();
		Static2 d=new Static2();

		a.input("Narendra Modi", 200000, "INDIA");
		b.input("Akhilesh Yadav", 150, "Uttar Pradesh");
		c.input("Lalu Yadav", 41, "Bihar");
		
		a.show();
		b.show();
		c.nation="INDIA";
		c.show();
		d.show();
	}
}