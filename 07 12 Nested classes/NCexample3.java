class A3
{
	private int x=10;
	void m1(){
		System.out.println("x = "+x);
		B3 b=new B3();
	}
	class B3
	{
		//static int y=20; Non-static NC object depends on the object of the outer class
		void m2(){
			System.out.println("x = "+x);
			//System.out.println("y = "+y);	
		}
	}
	
}

class NCexample3
{
	public static void main(String[] A){
		A3 a=new A3();
		A3.B3 b=a.new B3();
		//System.out.println(b.y);
		a.m1();
		b.m2();
	}
}