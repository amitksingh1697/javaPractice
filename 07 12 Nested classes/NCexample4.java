class A4
{
	private int x=10;
	void m1(){
		System.out.println("x = "+x);
		B4 b=new B4();
	}
	class B4
	{
		final static int y=20;//static with final is possible
		void m2(){
			System.out.println("x = "+x);
			System.out.println("y = "+y);	
		}
	}
	
}

class NCexample4
{
	public static void main(String[] A){
		A4 a=new A4();
		A4.B4 b=a.new B4();
		System.out.println(b.y);
		a.m1();
		b.m2();
	}
}