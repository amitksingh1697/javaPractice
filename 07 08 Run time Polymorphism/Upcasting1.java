class UC1A
{
	int x=10;
	void m1(){
		System.out.println("Hello m1 method of class A");
	}
}

class UC1B extends UC1A
{
	int y=20;
	void m2(){
		System.out.println("Hello m2 method of class B");
	}
}

class Upcasting1
{
	public static void main(String[] args){
		UC1B k=new UC1B();
		System.out.println(k.x);
		k.m1();
		System.out.println(k.y);
		k.m2();
		
		UC1A p=k;//Upcasting
		System.out.println(p.x);
		p.m1();
		//	System.out.println(p.y);
		//	p.m2();
		/*	Binding with method and Data member is not Possible
			because it exists in UC1B. */
	}
}