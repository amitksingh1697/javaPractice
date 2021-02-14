interface InterfaceA 
{
	//Abstract keyword is optional. interface keyword make sense of pure Abstraction.
	int x=30;//By default it will be static.
	abstract public void shape();
	abstract public void print();
}

class Interface1
{
	public static void main(String args[]){
		System.out.println(InterfaceA.x);
		InterfaceA s;
		s=new Circle1();
		s.shape();
		s.print();
		s=new Triangle1();
		s.shape();
		s.print();
		s=new Rectangle1();
		s.shape();
		s.print();		
	}
}