class CircleP extends AbstractP
{
	double ar;
	void shape(){
		int r=5;
		ar=3.14*r*r;
	}
	void print(){
		System.out.println("Circle's Area = "+ar);
	}
}