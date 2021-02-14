class NObjA
{
	int x=10;
	void m1(){
		System.out.println("x = "+x);
	}
}

class NObjB
{
	int y=20;
	static NObjA a=new NObjA();
	void m2(){
		System.out.println("y = "+y);
	}	
}

class NObject
{
	public static void main(String[] A){
		NObjB b=new NObjB();
		System.out.println(b.a.x);
		//System.out.println(b.x);
	}
}