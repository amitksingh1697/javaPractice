class Single
{
	int x=5;
	void Single(){
		System.out.println(x);		
	}
}

class Singlelevel extends Single
{
	int x=10;
	void Single(){
		System.out.println(x);
		System.out.println(super.x);
		super.Single();
	}
}

class Singlelevel_Inheritance
{
	public static void main(String[] args){
		Singlelevel a=new Singlelevel();
		System.out.println(a.x);
		a.Single();
	}
}