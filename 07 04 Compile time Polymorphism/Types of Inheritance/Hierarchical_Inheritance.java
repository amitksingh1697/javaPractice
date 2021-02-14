class HierarchicalT
{
	int x=10;
	void HierarchicalT(){
		int y=20;
		System.out.println(x);
		System.out.println(y);
	}
}

class HierarchicalT1 extends HierarchicalT
{
	int x=30;
	void HierarchicalT1(){
		int y=40;
		super.HierarchicalT();
		System.out.println(x);
		System.out.println(y);
	}
}
class HierarchicalT11 extends HierarchicalT1
{
	int x=50;
	void HierarchicalT11(){
		int y=60;
		super.HierarchicalT1();
		System.out.println(x);
		System.out.println(y);
		System.out.println();
	}
}
class HierarchicalT12 extends HierarchicalT1
{
	int x=50;
	void HierarchicalT12(){
		int y=60;
		super.HierarchicalT1();
		System.out.println(x);
		System.out.println(y);
		System.out.println();
	}
}

class HierarchicalT2 extends HierarchicalT
{
	int x=30;
	void HierarchicalT2(){
		int y=40;
		super.HierarchicalT();
		System.out.println(x);
		System.out.println(y);
	}
}
class HierarchicalT21 extends HierarchicalT2
{
	int x=50;
	void HierarchicalT21(){
		int y=60;
		super.HierarchicalT2();
		System.out.println(x);
		System.out.println(y);
		System.out.println();
	}
}

class HierarchicalT22 extends HierarchicalT2
{
	int x=50;
	void HierarchicalT22(){
		int y=60;
		super.HierarchicalT2();
		System.out.println(x);
		System.out.println(y);
		System.out.println();
	}
}

class HierarchicalT3 extends HierarchicalT
{
	int x=30;
	void HierarchicalT3(){
		int y=40;
		super.HierarchicalT();
		System.out.println(x);
		System.out.println(y);
	}
}

class HierarchicalT31 extends HierarchicalT3
{
	int x=50;
	void HierarchicalT31(){
		int y=60;
		super.HierarchicalT3();
		System.out.println(x);
		System.out.println(y);
		System.out.println();
	}
}

class HierarchicalT32 extends HierarchicalT3
{
	int x=50;
	void HierarchicalT32(){
		int y=60;
		super.HierarchicalT3();
		System.out.println(x);
		System.out.println(y);
		System.out.println();
	}
}


class Hierarchical_Inheritance
{
	public static void main(String[] args){
		System.out.println("Level-wise printing\tLeft to Right");

		HierarchicalT11 a=new HierarchicalT11();
		a.HierarchicalT11();
		HierarchicalT12 b=new HierarchicalT12();
		b.HierarchicalT12();
		HierarchicalT21 c=new HierarchicalT21();
		c.HierarchicalT21();
		HierarchicalT22 A=new HierarchicalT22();
		A.HierarchicalT22();
		HierarchicalT31 B=new HierarchicalT31();
		B.HierarchicalT31();
		HierarchicalT32 C=new HierarchicalT32();
		C.HierarchicalT32();
	}
}