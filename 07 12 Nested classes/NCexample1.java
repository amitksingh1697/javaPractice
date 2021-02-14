class A1
{
	int x=10;
	void m1(){
		System.out.println("x = "+x);
		B1 b=new B1();
	}
	class B1
	{
		int y=20;
		void m2(){
			System.out.println("y = "+y);	
		}
	}
	
}

class NCexample1
{
	public static void main(String[] A){
		//System.out.println(x);
		//B1 b=new B1();
		A1 a=new A1();
		System.out.println(a.x);
		A1.B1 b=a.new B1();
		System.out.println(b.y);
		//System.out.println(b.x);
		//System.out.println(a.y);
		a.m1();
		b.m2();
	}
}