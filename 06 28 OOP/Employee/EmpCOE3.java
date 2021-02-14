class COE3
{
	private String name;
	private int salary;
	private String cname;
	
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

class EmpCOE3
{
	public static void main(String s[])
	{
		COE3 a=new COE3();
		COE3 b=new COE3();
		COE3 c=new COE3();
		COE3 d=new COE3();

/*	Data members are not directly accessible
	b.name="Akhilesh Yadav";
	b.salary=150;
	b.cname="Uttar Pradesh";
*/
		a.input("Narendra Modi", 200000, "INDIA");
		b.input("Akhilesh Yadav", 150, "Uttar Pradesh");
		c.input("Lalu Yadav", 41, "Bihar");
		
		a.show();
		b.show();
		c.show();
		d.show();
	}
}