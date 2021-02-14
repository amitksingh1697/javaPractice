abstract class AbstractP
{
	//double ar; It's doen't make sense to be here.
	abstract void shape();
	abstract void print();
}

class PureAbstract
{
	public static void main(String args[]){
		AbstractP s;
		s=new CircleP();
		s.shape();
		s.print();
		s=new TriangleP();
		s.shape();
		s.print();
		s=new RectangleP();
		s.shape();
		s.print();		
	}
}