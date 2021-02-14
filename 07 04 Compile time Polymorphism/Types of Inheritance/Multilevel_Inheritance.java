class MultilevelA
{
	int x=10;
	void Multi(){
		int y=20;
		System.out.println(x);
		System.out.println(y);
	}
}

class MultilevelB extends MultilevelA
{
	int x=30;
	void Multi(){
		int y=40;
		super.Multi();
		System.out.println(x);
		System.out.println(y);	
	}
}

class MultilevelC extends MultilevelB
{
	int x=50;
	void Multi(){
		int y=60;
		super.Multi();
		System.out.println(x);
		System.out.println(y);	
	}
}

class MultilevelD extends MultilevelC
{
	int x=70;
	void Multi(){
		int y=80;
		super.Multi();
		System.out.println(x);
		System.out.println(y);
		System.out.println();
	}
}

class Multilevel_Inheritance
{
	public static void main(String[] args){
	//	MultilevelA a=new MultilevelA();
	//	MultilevelB b=new MultilevelB();
	//	MultilevelC c=new MultilevelC();
		MultilevelD d=new MultilevelD();		
		
		d.Multi();
	}
}