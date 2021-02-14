class RectangleP extends AbstractP
{
	double ar;
	void shape(){
		int b=5,l=8;
		ar=l*b;
	}
	void print(){
		System.out.println("Rectangle's Area = "+ar);
	}
}