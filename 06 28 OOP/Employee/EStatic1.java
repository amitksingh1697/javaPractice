class Static1
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

class EStatic1
{
	public static void main(String s[])
	{
		Static1 a=new Static1();
		Static1 b=new Static1();
		Static1 c=new Static1();
		Static1 d=new Static1();

		a.input("Narendra Modi", 200000, "INDIA");
		b.input("Akhilesh Yadav", 150, "Uttar Pradesh");
		c.input("Lalu Yadav", 41, "Bihar");
		
		a.show();
		b.show();
		c.show();
		d.show();
	}
}