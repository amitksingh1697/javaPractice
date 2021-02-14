class PolySuperclass
{
	void add(int a,int b){
		int c=a+b;
		System.out.println("Sum ="+c);
	}
	void add(double a,double b){
		double c=a+b;
		System.out.println("Sum ="+c);		
	}
	void add(float a,float b){
		float c=a+b;
		System.out.println("Sum ="+c);		
	}
}

class PolySubclass extends PolySuperclass
{
	
	void add(String a,String b){
		String c=a+b;
		System.out.println("Sum ="+c);
	}
}

class Polymorphism_Inheritance
{
	public static void main(String[] A)
	{
		PolySubclass a=new PolySubclass();
		a.add(3,5);
		a.add(5.89,4.12);
		a.add(2.3,5.7);
		a.add("Abhishek "," Rai");
	}
}