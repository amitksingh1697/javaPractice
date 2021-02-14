class COE1
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

class EmpCOE1
{
	public static void main(String s[])
	{
		COE1 a=new COE1();
		COE1 b=new COE1();
		COE1 c=new COE1();
		COE1 d=new COE1();

		a.input("Narendra Modi", 200000, "INDIA");
		b.input("Akhilesh Yadav", 150, "Uttar Pradesh");
		c.input("Lalu Yadav", 41, "Bihar");
		
		a.show();
		b.show();
		c.show();
		d.show();
	}
}