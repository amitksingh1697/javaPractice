interface InterfaceB
{
	public void shape();
	public void print();
}

class Interface2
{
	public static void main(String args[]){
		InterfaceB s;
		s=new Circle2();
		s.shape();
		s.print();
		s=new Triangle2();
		s.shape();
		s.print();
		s=new Rectangle2();
		s.shape();
		s.print();		
	}
}