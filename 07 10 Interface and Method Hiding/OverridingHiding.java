class Superclass
{
	static void testClass(){
		System.out.println("The class method in superclass");
	}
	void testInstance(){
		System.out.println("The instance method in superclass");
	}
}

class Subclass extends Superclass
{
	static void testClass(){
		System.out.println("The class method in subclass");
	}
	void testInstance(){
		System.out.println("The instance method in subclass");
	}
}

class OverridingHiding
{
	public static void main(String[] A){
		Superclass my=new Subclass();
		Superclass.testClass();//my.testClass();
		my.testInstance();
	}
}