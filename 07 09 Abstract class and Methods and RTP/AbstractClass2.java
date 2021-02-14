abstract class Abstract2A
{
	double ar;
	void shape(){
		
	}
	void print(){
		System.out.println("Area = "+ar);
	}
}

class Abstract2
{
	public static void main(String args[]){
		Abstract2A s;
		//s=new Abstract2A();
		//s.shape();
		//s.print();
		s=new Abstract2ACircle();
		s.shape();
		s.print();
		s=new Abstract2ATriangle();
		s.shape();
		s.print();
		s=new Abstract2ARectangle();
		s.shape();
		s.print();
	}
}