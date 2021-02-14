class DH1A
{
	int x=10;
}

class DH1B extends DH1A
{
	int y=20;
}

class DataHiding1
{
	public static void main(String[] args){
		DH1B k=new DH1B();
		System.out.println(k.x);
		System.out.println(k.y);
	}
}