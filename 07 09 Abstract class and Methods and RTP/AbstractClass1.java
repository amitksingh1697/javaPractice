class Abstract1A
{
	double ar;
	void shape(){
		
	}
	void print(){
		System.out.println("Area = "+ar);
	}
}

class Abstract1
{
	public static void main(String args[]){
		Abstract1A s;
		s=new Abstract1A();//We can also create an object of this class which we don't need.
		s.shape();
		s.print();
		s=new Abstract1ACircle();
		s.shape();
		s.print();
		s=new Abstract1ATriangle();
		s.shape();
		s.print();
		s=new Abstract1ARectangle();
		s.shape();
		s.print();
	}
}