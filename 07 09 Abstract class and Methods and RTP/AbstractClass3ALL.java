abstract class Abstract3A
{
	double ar;
	void shape(){
		
	}
	void print(){
		System.out.println("Area = "+ar);
	}
}


class Abstract3ATriangle extends Abstract3A
{
	void Jhingalala(){// Sasura Dhoka Dai dihis.
		int b=5,h=8;
		ar=b*h/2;
	}
}

class Abstract3ARectangle extends Abstract3A
{
	void shape(){
		int b=5,l=8;
		ar=l*b;
	}
}

class Abstract3ACircle extends Abstract3A
{
	void shape(){
		int r=5;
		ar=3.14*r*r;
	}
}

class Abstract3
{
	public static void main(String args[]){
		Abstract3A s;
		
		s=new Abstract3ACircle();
		s.shape();
		s.print();
		s=new Abstract3ATriangle();
		s.shape();
		s.print();
		s=new Abstract3ARectangle();
		s.shape();
		s.print();
	}
}