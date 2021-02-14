class COE2
{
	String name;
	int salary;
	String cname;
	
	void input(String n, int s, String c)
	{
		name=n;
		salary=s;
		cname=c;
	}
	void show()
	{
		System.out.println(name);
		System.out.println(salary);
		System.out.println(cname);
		System.out.println();		
	}
}

class EmpCOE2
{
	public static void main(String s[])
	{
		COE2 a=new COE2();
		COE2 b=new COE2();
		COE2 c=new COE2();
		COE2 d=new COE2();

		a.input("Narendra Modi", 200000, "INDIA");
		b.name="Akhilesh Yadav";
		b.salary=150;
		b.cname="Uttar Pradesh";
		c.input("Lalu Yadav", 41, "Bihar");
		
		a.show();
		b.show();
		c.show();
		d.show();
	}
}