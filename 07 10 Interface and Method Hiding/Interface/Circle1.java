class Circle1 implements InterfaceA
{
	double ar;
	public void shape(){
		int r=5;
		ar=3.14*r*r;
	}
	public void print(){
		System.out.println("Circle's Area = "+ar);
	}
}