class Para1
{
	int x;
	Para1(int s)
	{
		x=s;
		System.out.println("x = "+x);
	}
}

class Parameterised1
{
	public static void main(String[] s)
	{
		Para1 a=new Para1(55);
		Para1 b=new Para1(13);
	}
}