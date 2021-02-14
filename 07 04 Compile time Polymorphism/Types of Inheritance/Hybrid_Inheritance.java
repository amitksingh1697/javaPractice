class HybridT
{
	//There must not be multiple inheritance in it.

	int x=10;
	void HybridT(){
		int y=20;
		System.out.println(x);
		System.out.println(y);
	}
}

class HybridT1 extends HybridT
{
	int x=30;
	void HybridT1(){
		int y=40;
		super.HybridT();
		System.out.println(x);
		System.out.println(y);
	}
}
class HybridT11 extends HybridT1
{
	int x=50;
	void HybridT11(){
		int y=60;
		super.HybridT1();
		System.out.println(x);
		System.out.println(y);
		System.out.println();
	}
}
class HybridT12 extends HybridT1
{
	int x=50;
	void HybridT12(){
		int y=60;
		super.HybridT1();
		System.out.println(x);
		System.out.println(y);
		System.out.println();
	}
}

class HybridT2 extends HybridT
{
	int x=30;
	void HybridT2(){
		int y=40;
		super.HybridT();
		System.out.println(x);
		System.out.println(y);
	}
}
class HybridT21 extends HybridT2
{
	int x=50;
	void HybridT21(){
		int y=60;
		super.HybridT2();
		System.out.println(x);
		System.out.println(y);
		System.out.println();
	}
}

class HybridT22 extends HybridT2
{
	int x=50;
	void HybridT22(){
		int y=60;
		super.HybridT2();
		System.out.println(x);
		System.out.println(y);
		System.out.println();
	}
}

class HybridT3 extends HybridT
{
	int x=30;
	void HybridT3(){
		int y=40;
		super.HybridT();
		System.out.println(x);
		System.out.println(y);
	}
}

class Hybrid_Inheritance
{
	public static void main(String[] args){
		System.out.println("Level-wise printing\tLeft to Right");

		HybridT11 a=new HybridT11();
		a.HybridT11();
		HybridT12 b=new HybridT12();
		b.HybridT12();
		HybridT21 c=new HybridT21();
		c.HybridT21();
		HybridT22 A=new HybridT22();
		A.HybridT22();
	}
}