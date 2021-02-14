class Para
{
	int x,y;
	Para(int s)
	{
		System.out.println("Constructor with one arguments.");
		x=s;
		System.out.println("x = "+x);
	}
	Para()
	{
		System.out.println("Constructor with no arguments.");
	}
	Para(int s,int t)
	{
		System.out.println("Constructor with two arguments.");
		x=s;y=t;
		System.out.println("x = "+x+" y = "+y);
	}
}

class ParaOverloading
{
	public static void main(String[] s)
	{
		Para a=new Para(55);
		Para b=new Para(13,22);
		Para c=new Para();
	}
}