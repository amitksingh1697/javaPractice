class Emp1
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
	private static String politics;
	static void inPol(String p)
	{
		politics=p;
	}
	void show()
	{
		System.out.println(name+" "+salary+" "+cname+" "+politics);
	}
}

class Employee1
{
	public static void main(String s[])
	{
		Emp1.inPol("Politcian");
		//error a.inPol("Politcian");
		Emp1 a=new Emp1();
		Emp1 b=new Emp1();
		Emp1 c=new Emp1();
		Emp1 d=new Emp1();

		a.input("Narendra Modi", 200000, "\t\tINDIAN");
		b.input("Akhilesh Yadav", 150, "\t\tUP ka chora");
		c.input("Lalu Yadav", 41, "\t\tBihari buffalo");
		d.input("Rahul Gandhi", 1, "\t\tTumse na ho payega");
		
		a.show();
		b.show();
		c.show();
		d.show();
	}
}