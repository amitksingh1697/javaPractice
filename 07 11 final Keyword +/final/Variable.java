class Variable 
{
	int x=20;//class level non-static variable
	static int y=20;//class level static variable
	void m1(){
		int p=30;//local variable
		//static int q=40; local variable can't be static.
		System.out.println(x);
		System.out.println(y);
		System.out.println(p);
		//System.out.println(q);
	}
}