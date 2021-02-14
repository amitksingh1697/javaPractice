class LocalVariable1
{
	final int a=10;
	//final int c; must be initialised here or in constructor.
	void m1(){
		int b;
		System.out.println(a);
		//System.out.println(b); local variable have no value by default so compiler avoid it's usage.
	}
	void m2(){
		System.out.println(a);
		//System.out.println(b);
		final int b=20;
		//b=15; value of final variable can't be changed.
		final int c;
	}
}