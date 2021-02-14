class Triangle1 implements InterfaceA
{
	double area;
	public void shape(){
		int b=5,h=8;
		area=b*h/2;
	}
	public void print(){
		System.out.println("Triangle's Area = "+area);
	}
}