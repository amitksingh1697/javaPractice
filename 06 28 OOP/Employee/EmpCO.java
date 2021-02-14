class CO
{
	String name;
	int salary;
	String cname;
}

class EmpCO
{
	public static void main(String s[])
	{
		/*
		new Emp(); declare the variable of type class it returns the refernce of this variable
		Emp a=new Emp(); is a is the reference variable which stores the reference 
						 which is rerurned by the created variable
		*/
		
		CO a=new CO();
		CO b=new CO();
		CO c=new CO();
		CO d=new CO();
		
		a.name="Narendra Modi";
		a.salary=200000;
		a.cname="INDIA";
		b.name="Akhilesh Yadav";
		b.salary=150;
		b.cname="Uttar Pradesh";
		c.name="Lalu Yadav";
		c.salary=40;
		c.cname="Bihar";
		
		System.out.println(a.name);
		System.out.println(a.salary);
		System.out.println(a.cname);
		System.out.println();
		System.out.println(b.name);
		System.out.println(b.salary);
		System.out.println(b.cname);
		System.out.println();
		System.out.println(c.name);
		System.out.println(c.salary);
		System.out.println(c.cname);
		System.out.println();
		System.out.println(d.name);
		System.out.println(d.salary);
		System.out.println(d.cname);
		System.out.println();
	}
}