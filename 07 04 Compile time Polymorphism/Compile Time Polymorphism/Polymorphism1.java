class Poly1
{
	/*	Return type doesn't matters
    	Method name must be same
		Argument type must be different */
		
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
	void add(String a,String b){
		String c=a+b;
		System.out.println("Sum ="+c);
	}
}

class Polymorphism1
{
	public static void main(String[] Abhi)
	{
		Poly1 a=new Poly1();
		a.add(3,5);
		a.add(5.89,4.12);
		a.add(2.3,5.7);
		a.add("Abhishek "," Rai");
	}
}