class TriangleP extends AbstractP
{
	double area;
	void shape(){
		int b=5,h=8;
		area=b*h/2;
	}
	void print(){
		System.out.println("Triangle's Area = "+area);
	}
}