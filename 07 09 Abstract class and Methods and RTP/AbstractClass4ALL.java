abstract class Abstract4A
{
	double ar;//every class which extends this class has make abstract method otherwise CTE
	abstract void shape();//Abstract method has not body even a blank body.
	void print(){
		System.out.println("Area = "+ar);
	}
}


class Abstract4ATriangle extends Abstract4A
{
	void shape(){
		int b=5,h=8;
		ar=b*h/2;
	}
}

class Abstract4ARectangle extends Abstract4A
{
	void shape(){
		int b=5,l=8;
		ar=l*b;
	}
}

class Abstract4ACircle extends Abstract4A
{
	void shape(){
		int r=5;
		ar=3.14*r*r;
	}
}

class Abstract4
{
	public static void main(String args[]){
		Abstract4A s;
		
		s=new Abstract4ACircle();
		s.shape();
		s.print();
		s=new Abstract4ATriangle();
		s.shape();
		s.print();
		s=new Abstract4ARectangle();
		s.shape();
		s.print();
	}
}