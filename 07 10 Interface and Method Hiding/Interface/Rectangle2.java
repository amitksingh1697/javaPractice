class Rectangle2 implements InterfaceB
{
	double ar;
	public void shape(){
		int b=5,l=8;
		ar=l*b;
	}
	public void print(){
		System.out.println("Rectangle's Area = "+ar);
	}
}