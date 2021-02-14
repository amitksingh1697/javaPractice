class A2
{
	private int x=10;
	void m1(){
		System.out.println("x = "+x);
		B2 b=new B2();
	}
	class B2
	{
		int y=20;
		void m2(){
			System.out.println("x = "+x);
			System.out.println("y = "+y);	
		}
	}
	
}

class NCexample2
{
	public static void main(String[] A){
		A2 a=new A2();
		A2.B2 b=a.new B2();
		System.out.println(b.y);
		a.m1();
		b.m2();
	}
}