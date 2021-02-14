class ThisF
{
	int x=67;
	void Display(int x)
	{
		System.out.println(this.x);
		this.x=x;
		System.out.println(this.x);//class level 'x'
		System.out.println(x);//Method level 'x'
	}
}

class ThisFeild
{
	public static void main(String[] args)
	{
		ThisF a=new ThisF();
		a.Display(3);
		System.out.println(a.x);
	}
	
}