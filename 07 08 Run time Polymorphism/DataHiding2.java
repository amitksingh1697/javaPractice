class DH2A
{
	int x=10;
}

class DH2B extends DH2A
{
	int x=20;
}

class DataHiding2
{
	public static void main(String[] args){
		DH2B k=new DH2B();//Data member 'x' of DH2A is Hided by 'x' of DH2B due to same name
		System.out.println(k.x);
		DH2A p=new DH2A();
		System.out.println(p.x);
	}
}