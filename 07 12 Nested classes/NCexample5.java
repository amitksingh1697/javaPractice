class A5
{
	int z=30;
	static int x=10;
	void m1(){
		System.out.println("x = "+x);
		B5 b=new B5();
	}
	static class B5
	{
		static int y=20;
		void m2(){
			System.out.println("x = "+x);
			System.out.println("y = "+y);
			//System.out.println("z = "+z);
		}
	}
	
}

class NCexample5
{
	public static void main(String[] A){
		System.out.println(A5.B5.y);
		System.out.println(A5.x);
		A5.B5 b=new A5.B5();
		System.out.println(b.y);
		b.m2();
	}
}