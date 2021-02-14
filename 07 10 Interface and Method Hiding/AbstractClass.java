abstract class AbstractA
{
	double ar;
	abstract void shape();
	void print(){
		System.out.println("Area = "+ar);
	}
}

class Abstract
{
	public static void main(String args[]){
		AbstractA s;
		s=new Circle();
		s.shape();
		s.print();
		s=new Triangle();
		s.shape();
		s.print();
		s=new Rectangle();
		s.shape();
		s.print();
		/*
			In output we get confused in the area of circle,rectangle and triangle.
		*/
	}
}